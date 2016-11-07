package io.khasang.helpdesk.dao.daoimpl;

import io.khasang.helpdesk.dao.Dao;
import io.khasang.helpdesk.entity.Users;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hibernate.envers.DefaultRevisionEntity_.id;

@Repository
//@Component
public class HibernateUserDao implements Dao {
    private  static final Logger logger = LoggerFactory.getLogger(HibernateUserDao.class);

    @Autowired
    private SessionFactory sessionFactory;

    public HibernateUserDao() {
    }

    @Autowired
    public HibernateUserDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Users getUserById(long id) {
        Criteria criteria = sessionFactory.
                getCurrentSession().
                createCriteria(Users.class);
        criteria.add(Restrictions.eq("id", id));
        return (Users) criteria.uniqueResult();
    }


    @Override
    @SuppressWarnings("unchecked")
    public List<Users> getUserList() {
        Criteria criteria = sessionFactory.
                getCurrentSession().
                createCriteria(Users.class);
        return (List<Users>) criteria.list();
    }

    @Override
    public void addUser(Users users) {
        this.sessionFactory.getCurrentSession().save(users);
        logger.info("User has added. Details:" + users);
    }

    @Override
    public void updateUser(Users users) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(users);
        logger.info("User has updated. Details:" + users);
    }

    @Override
    public void deleteUser(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Users users1  = (Users)session.load(Users.class, id);
        if(users1!=null){
            session.delete(users1);
        }
    }

    @Override
    public void regUser(Users users) {
//        Users newUser = new Users();
//        newUser.setLogin(users.getLogin());
//        newUser.setPassword(users.getPassword());
//        newUser.setRole(users.getRole());
//        newUser.setEmail(users.getEmail());
        try {
            sessionFactory.getCurrentSession().save(users);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

//    @Override
//    public Users getUserLoginById(long id) {
//        Criteria criteria = sessionFactory.
//                getCurrentSession().
//                createCriteria(Users.class);
//        criteria.add(Restrictions.eq("id", id));
//        return (Users) criteria.uniqueResult();
//    }
}
