package io.khasang.model;


import io.khasang.helpdesk.config.AppContext;
import io.khasang.helpdesk.config.AppSecurityConfig;
import io.khasang.helpdesk.config.application.WebConfig;
import io.khasang.helpdesk.model.ListExample;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.junit.Test;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppContext.class,
        WebConfig.class, AppSecurityConfig.class})
public class ListExampleTest {
    @Autowired
    ListExample listExample;

    @Before
    public void dataSourceConnect(){
        System.out.println("Получить подключение к базе");
    }

    @After
    public void dataSourceClose(){
        System.out.println("Закрыть подключение к базе");
    }

    @Test
    public void testExamplemassiv(){
        String[] initArray = { "canada", "austria", "usa"};
        String[] resultArray= { "canada", "austria", "usa"};
   //     assertEquals("Ошибка с ссылками на массивы", resultArray, listExample.examplemassiv(initArray));
   //     assertArrayEquals("Ошибка с содержанием массивов", resultArray, listExample.examplemassiv(initArray));
    }
}
