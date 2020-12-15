package com.example.designpatternsdemo.decorator;

/**
 * @author pangliming
 * 装饰者模式
 */
public class Client {
    public static void main(String[] args){
        BoyPerson boyPerson = new BoyPerson();

        Person uniformPerson = new BoyUniformDecorator(boyPerson);
        uniformPerson.dress();
        Person homePerson = new BoyHomeDecorator(boyPerson);
        homePerson.dress();
    }
}
