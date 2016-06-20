package io.khasang.model;


import io.khasang.config.TestDataSourceContext;
import io.khasang.helpdesk.config.AppContext;
import io.khasang.helpdesk.config.AppSecurityConfig;
import io.khasang.helpdesk.config.WebConfig;
import io.khasang.helpdesk.model.ArrayBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes =
        {AppContext.class,
                WebConfig.class,
                AppSecurityConfig.class,
                TestDataSourceContext.class})

public class TempTest {
    @Autowired
    ArrayBean arrayBean;

    @Test
    public void testArrayEquals() {
        assertArrayEquals(arrayBean.getArray(), arrayBean.getArray());
    }

    @Test
    public void testNotArrayEquals() {
        assertNotEquals(arrayBean.getArray(), arrayBean.getArray());
    }
}
