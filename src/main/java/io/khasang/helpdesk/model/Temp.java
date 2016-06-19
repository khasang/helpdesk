package io.khasang.helpdesk.model;

import org.springframework.stereotype.Component;

@Component
public class Temp {

    public int[] list = { 90, 100, 105};
    int[] listing = {0};

    public int example(String color) {
        if (color.equals("red")) {
            return 2;
        } else if (color.equals("green")) {
            return 3;
        } else {
            return 0;
        }
    }

    public int[] examplemassiv(int[] array){
        if (array.equals(list)){
            return array;
        }else {
            return listing;
        }
    }

    public void res(){
        System.out.println(examplemassiv(list));
    }
}
