package com.pavlova.homeworks.lecture23;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class cl = Class.forName("com.pavlova.homeworks.lecture23.MyTestAnnotetion");
            Method[] method1 = cl.getMethods();
            for (Method md : method1) {
                if (md.isAnnotationPresent(MyTest.class)) {
                    System.out.println("in processing");
                    md.invoke(null);
                }
                System.out.println("End");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}