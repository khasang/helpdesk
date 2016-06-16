package io.khasang.helpdesk.model;

import io.khasang.helpdesk.config.AppContext;
import io.khasang.helpdesk.config.AppSecurityConfig;
import io.khasang.helpdesk.config.application.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppContext.class, WebConfig.class, AppSecurityConfig.class})

public class TempTest {
    @Autowired
    Temp temp;

    @Test
    public void testExample() {
//        Temp temp = new Temp();
        assertEquals(2, temp.example("red"));
    }

    @Test
    public void testArrayExample(){
//        Temp temp = new Temp();
        int[] initArray = {2,3,4};
        int[] resultArray = {2,3,4};
//        assertEquals(resultArray, temp.arrayExample(initArray));
        assertArrayEquals(resultArray, temp.arrayExample(initArray));
    }

}
