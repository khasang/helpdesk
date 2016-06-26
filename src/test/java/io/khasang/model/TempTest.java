package io.khasang.model;


import io.khasang.helpdesk.config.AppContext;
import io.khasang.helpdesk.config.AppSecurityConfig;
import io.khasang.helpdesk.config.application.WebConfig;
import io.khasang.helpdesk.model.Temp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.assertArrayEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppContext.class, WebConfig.class, AppSecurityConfig.class})
public class TempTest {

    @Autowired
    Temp temp;

    @Before
    public void startTest() {
        System.out.println("This test was started");
    }

    @After
    public void finishTest() {
        System.out.println("This test was finished");
    }

    @Test
    public void arrayStringCompare() {
        assertArrayEquals(temp.getStringArray(), temp.getStringArray());
        assertArrayEquals(temp.getStringArray(), new String[]{"ss"});
        assertArrayEquals(temp.getStringArray(), temp.getIntArray());
    }

    @Test
    public void arrayIntCompare() {
        assertArrayEquals(temp.getIntArray(), temp.getIntArray());
        assertArrayEquals(temp.getIntArray(), new Integer[]{234, 568});
    }
}
