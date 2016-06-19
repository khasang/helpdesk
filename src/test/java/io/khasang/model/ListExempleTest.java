package io.khasang.model;


import io.khasang.helpdesk.model.ListExemple;
import io.khasang.helpdesk.model.Temp;
import org.junit.After;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class ListExempleTest {
    @Autowired
    ListExemple listExemple;

    String[] initArray = { "canada", "austria", "usa"};
    String[] resultArray= { "canada", "austria", "usa"};

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
      //  assertEquals("Ошибка с ссылками на массивы", resultArray, listExemple.examplemassiv(initArray));
        assertArrayEquals("Ошибка с содержанием массивов", resultArray, listExemple.examplemassiv(initArray));
    }
}
