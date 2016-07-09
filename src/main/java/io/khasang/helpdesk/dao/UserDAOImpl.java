package io.khasang.helpdesk.dao;


import io.khasang.helpdesk.entity.Users;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    SessionFactory sessionFactory;

    public UserDAOImpl(JdbcTemplate jdbcTemplate) {
    }

    public UserDAOImpl() {
    }

    @Override
    public Users getById(long id) {
        return sessionFactory.getCurrentSession().get(Users.class, id);
    }

    @Override
    public void insert(Users users) {
        sessionFactory.getCurrentSession().save(users);
    }

    @Override
    public List<Users> getAll() {
        return sessionFactory.getCurrentSession().createCriteria(Users.class).list();
    }

    @Override
    public void update(Users users) {
        sessionFactory.getCurrentSession().update(users);
    }

    @Override
    public void deleteById(long id) {
        Users users = (Users) sessionFactory.getCurrentSession().createCriteria(Users.class).add(Restrictions.eq("id", id))
                .uniqueResult();
        sessionFactory.getCurrentSession().delete(users);
    }
}
