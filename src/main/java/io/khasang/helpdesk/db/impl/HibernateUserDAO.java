package io.khasang.helpdesk.db.impl;

import io.khasang.helpdesk.db.UserDAO;
import io.khasang.helpdesk.entities.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateUserDAO implements UserDAO {
    private final SessionFactory sessionFactory;

    @Autowired
    public HibernateUserDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void deleteUser(User user) {
        final Session session = sessionFactory.getCurrentSession();
        session.delete(user);
        session.flush();
    }

    @Override
    public void deleteAllUsers() {
        final String query = "TRUNCATE TABLE users";
        sessionFactory.
                getCurrentSession().
                createSQLQuery(query).
                executeUpdate();
    }

    @Override
    public User getUserById(int id) {
        Criteria criteria = sessionFactory.
                getCurrentSession().
                createCriteria(User.class);
        criteria.add(Restrictions.eq("id", id));
        return (User) criteria.uniqueResult();
    }

    @Override
    public User getUserByLogin(String login) {
        Criteria criteria = sessionFactory.
                getCurrentSession().
                createCriteria(User.class);
        criteria.add(Restrictions.eq("login", login));
        return (User) criteria.uniqueResult();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getUserList() {
        Criteria criteria = sessionFactory.
                getCurrentSession().
                createCriteria(User.class);
        return (List<User>) criteria.list();
    }
}
