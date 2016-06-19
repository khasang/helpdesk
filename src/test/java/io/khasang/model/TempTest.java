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

import static org.junit.Assert.assertEquals;

    @RunWith(SpringJUnit4ClassRunner.class)
    @WebAppConfiguration
    @ContextConfiguration(classes = {AppContext.class,
            WebConfig.class, AppSecurityConfig.class})

    public class TempTest {
        @Autowired
        Temp temp;

        private static int count;

        @Before
        public void dataSourceConnect() {
            System.out.println("получить подключение к базе");
        }

        @After
        public void dataSourceClose() {
            System.out.println("закрыть подключение к базе");
        }

        @Test
        public void testExample() {
//            assertEquals("Это очень плохо, что тест не прошел!", 2, temp.example("red"));
        }

    }
