package io.khasang.service;


import io.khasang.config.TestDataSourceContext;
import io.khasang.helpdesk.config.AppContext;
import io.khasang.helpdesk.config.security.AppSecurityConfig;
import io.khasang.helpdesk.config.web.WebConfig;
import io.khasang.helpdesk.service.BackupService;
import io.khasang.helpdesk.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes =
        {AppContext.class,
                WebConfig.class,
                AppSecurityConfig.class,
                TestDataSourceContext.class})

public class BackupTest {
    @Autowired
    BackupService backupService;

    @Autowired
    UserService userService;

    @Test
    public void testBackupIsConsistent() {
        String backup = backupService.getBackup();
        String backup2 = backupService.getBackup();

        assertEquals("Backup must be consistent.", backup, backup2);
    }

    @Test
    public void testBackupIsDifferentAfterDBChange() {
        String backup = backupService.getBackup();

        userService.deleteAllUsers();
        String backup2 = backupService.getBackup();
        assertNotEquals("Backup must not be the same after DB changed.", backup, backup2);

        backupService.restoreFromBackup(backup);
    }

    @Test
    public void testBackupRestoreDB() {
        String backup = backupService.getBackup();

        userService.deleteAllUsers();
        backupService.restoreFromBackup(backup);
        String backup2 = backupService.getBackup();

        assertEquals("Backup must be the same after DB restored.", backup, backup2);
    }

}
