package com.example.designpatternsdemo.decorator;

/**
 * @author pangliming
 * 男人也是人
 */
public class BoyPerson extends Person{
    @Override
    public void dress() {
        System.out.println("先穿上内库");
    }
}
