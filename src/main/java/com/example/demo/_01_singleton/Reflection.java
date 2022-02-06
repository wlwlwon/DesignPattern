package com.example.demo._01_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings5 settings = Settings5.INSTANCE;

        Settings5 settings1 = null;
        Constructor<?>[] declaredConstructors = Settings5.class.getDeclaredConstructors();
        for(Constructor<?> constructor : declaredConstructors){
            constructor.setAccessible(true);
            settings1 = (Settings5) constructor.newInstance("INSTANCE");
        }

        System.out.println(settings == settings1);
    }
}
