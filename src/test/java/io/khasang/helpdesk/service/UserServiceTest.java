package io.khasang.helpdesk.service;

import io.khasang.helpdesk.config.AppContext;
import io.khasang.helpdesk.config.TestDataSourceContext;
import io.khasang.helpdesk.config.db.HibernateConfig;
import io.khasang.helpdesk.config.security.AppSecurityConfig;
import io.khasang.helpdesk.config.web.WebConfig;
import io.khasang.helpdesk.entities.User;
import io.khasang.helpdesk.enums.Role;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes =
        {AppContext.class,
                WebConfig.class,
                AppSecurityConfig.class,
                TestDataSourceContext.class,
                HibernateConfig.class})
public class UserServiceTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    SessionFactory sessionFactory;
    @Autowired
    private UserService userService;

    @Test
    public void testNotExistingUser() {
        User user = userService.getUserByLogin("NonExistingLogin");
        assertNull(user);
    }

    @Test
    public void testUserInsert() {
        User testUser = generateTestUser();
        userService.addUser(testUser);
        User user = userService.getUserByLogin(testUser.getLogin());
        assertEquals(testUser.getLogin(), user.getLogin());
        assertEquals(testUser.getPassword(), user.getPassword());
        assertEquals(testUser.getRole(), user.getRole());
    }

    @Test(expected = org.hibernate.exception.ConstraintViolationException.class)
    public void testInsertUniqueLogin() {
        userService.addUser(generateTestUser());
        userService.addUser(generateTestUser());
        sessionFactory.getCurrentSession().flush();
    }

    @Test
    public void testPasswordUpdate() {
        User testUser = generateTestUser();
        userService.addUser(testUser);

        testUser.setPassword("newUniquePassword");
        userService.updateUser(testUser);

        User user2 = userService.getUserById(testUser.getId());
        assertEquals(testUser.getPassword(), user2.getPassword());
    }

    @Test
    public void testChangeUserLogin() {
        User testUser = generateTestUser();
        userService.addUser(testUser);


        final String newLogin = "newLogin";
        testUser.setLogin(newLogin);
        userService.updateUser(testUser);

        assertNull("Still have user with old login in DB.", userService.getUserByLogin(generateTestUser().getLogin()));
        User user2 = userService.getUserByLogin(newLogin);
        assertEquals(testUser.getId(), user2.getId());
    }

    @Test
    public void testDeleteAllUsers() {
        userService.addUser(generateTestUser());

        final int count = countRowsInTable("users");
        assertTrue(count > 0);

        userService.deleteAllUsers();
        final int count2 = countRowsInTable("users");
        assertTrue(count2 == 0);
    }

    @Test
    public void testGetUserList() {
        userService.deleteAllUsers();
        final List<User> userList1 = userService.getUsersAsList();
        assertTrue(userList1.size() == 0);

        User testUser = generateTestUser();
        userService.addUser(testUser);
        final List<User> userList2 = userService.getUsersAsList();
        assertTrue(userList2.size() == 1);

        User user = userList2.get(0);
        assertEquals(testUser.getLogin(), user.getLogin());
        assertEquals(testUser.getPassword(), user.getPassword());
        assertEquals(testUser.getRole(), user.getRole());
    }

    private User generateTestUser() {
        User testUser = new User();
        testUser.setLogin("test");
        testUser.setPassword("test");
        testUser.setRole(Role.ROLE_ADMIN);
        return testUser;
    }

}
