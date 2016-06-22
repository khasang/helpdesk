package io.khasang.service;

import io.khasang.config.TestDataSourceContext;
import io.khasang.helpdesk.config.AppContext;
import io.khasang.helpdesk.config.security.AppSecurityConfig;
import io.khasang.helpdesk.config.web.WebConfig;
import io.khasang.helpdesk.db.UserDAO;
import io.khasang.helpdesk.enums.Role;
import io.khasang.helpdesk.model.User;
import io.khasang.helpdesk.service.BackupService;
import io.khasang.helpdesk.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
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
                TestDataSourceContext.class})
public class UserTest {
    private static String backup;
    @Autowired
    private BackupService backupService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private User testuser;

    @Before
    public void backup() {
        backup = backupService.getBackup();
        testuser = new User();
        testuser.setLogin("test");
        testuser.setPassword("test");
        testuser.setRole(Role.ROLE_ADMIN.toString());
    }

    @Test(expected = EmptyResultDataAccessException.class)
    public void testNotExistingUser() {
        User user = userService.getUserByLogin("NonExistingLogin");
    }

    @Test
    public void testUserInsert() {
        userService.addUser(testuser);
        User user = userService.getUserByLogin(testuser.getLogin());
        assertEquals(testuser.getLogin(), user.getLogin());
        assertEquals(testuser.getPassword(), user.getPassword());
        assertEquals(testuser.getRole(), user.getRole());
    }

    @Test(expected = DuplicateKeyException.class)
    public void testInsertUniqueLogin() {
        userDAO.addUser(testuser);
        userDAO.addUser(testuser);
    }

    @Test
    public void testPasswordUpdate() {
        userService.addUser(testuser);
        User user = userService.getUserByLogin(testuser.getLogin());
        String password = user.getPassword();
        user.setPassword("newUniquePassword");
        userService.updateUser(user);

        user = userService.getUserByLogin(testuser.getLogin());
        assertNotEquals(password, user.getPassword());
    }

    @Test
    public void testChangeUserLogin() {
        userService.addUser(testuser);

        User user = userService.getUserByLogin(testuser.getLogin());
        final String newLogin = "newLogin";
        user.setLogin(newLogin);
        userService.updateUser(user);

        try {
            userService.getUserByLogin(testuser.getLogin());
            fail("Still have user with old login in DB.");
        } catch (EmptyResultDataAccessException e) {
        }

        user = userService.getUserByLogin(newLogin);
        assertEquals(newLogin, user.getLogin());
    }

    @Test
    public void testDeleteAllUsers() {
        userService.addUser(testuser);

        String sql = "select count(*) from users";
        final int count = jdbcTemplate.queryForObject(sql, Integer.class);
        assertTrue(count > 0);

        userService.deleteAllUsers();
        final int count2 = jdbcTemplate.queryForObject(sql, Integer.class);
        assertTrue(count2 == 0);
    }

    @Test
    public void testGetUserList() {
        userService.deleteAllUsers();
        final List<User> userList1 = userService.getUsersAsList();
        assertTrue(userList1.size() == 0);

        userService.addUser(testuser);
        final List<User> userList2 = userService.getUsersAsList();
        assertTrue(userList2.size() == 1);

        User user = userList2.get(0);
        assertEquals(testuser.getLogin(), user.getLogin());
        assertEquals(testuser.getPassword(), user.getPassword());
        assertEquals(testuser.getRole(), user.getRole());
    }

    @After
    public void restore() {
        backupService.restoreFromBackup(backup);
    }

}
