package com.driver;

public class Main {
    public static void main(String[] args) {
         RWOnly obj1 = new RWOnly() ;
         // name has a Private access in 'com.driver.RWOnly''
        obj1.setName("Cool") ;
        String name = obj1.getName();
        System.out.println(name) ;
    }
}