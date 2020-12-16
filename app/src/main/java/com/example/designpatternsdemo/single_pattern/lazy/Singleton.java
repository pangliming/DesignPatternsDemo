package com.example.designpatternsdemo.single_pattern.lazy;

/**
 * @author pangliming
 * 懒汉模式
 */
class Singleton {

    private static Singleton ourInstance;
    private Singleton(){

    }

    public static synchronized Singleton getSingleton(){

        if (null == ourInstance) {
            ourInstance = new Singleton();
        }

        return ourInstance;
    }
}
