package com.example.designpatternsdemo.single_pattern.hungry;

/**
 * @author pangliming
 * 单例模式：饿汉式 懒
 */
class CEO extends Staff{
    private static CEO ourInstance = new CEO();

    private CEO(){ }

    public static CEO getCEO(){
        return ourInstance;
    }

    @Override
    public void work() {
        super.work();
    }
}
