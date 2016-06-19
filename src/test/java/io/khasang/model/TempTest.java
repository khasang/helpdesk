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

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppContext.class,
        WebConfig.class, AppSecurityConfig.class})
public class TempTest {
    @Autowired
    Temp temp;

    @Before
    public void dataSourceConnect(){
        System.out.println("Получить подключение к базе");
    }

    @After
    public void dataSourceClose(){
        System.out.println("Закрыть подключение к базе");
    }

    @Test
    public void testExample(){
        assertEquals("Это очень плохо, что тест не прошел!", 2 , temp.example("red"));
        assertEquals("Это очень плохо, что тест не прошел!", 3 , temp.example("green"));
        assertEquals("Это очень плохо, что тест не прошел!", 0 , temp.example("yellow"));
        assertEquals("Это очень плохо, что тест не прошел!", 0 , temp.example("white"));
    }
}