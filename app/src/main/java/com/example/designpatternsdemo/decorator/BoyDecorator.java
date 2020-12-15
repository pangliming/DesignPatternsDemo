package com.example.designpatternsdemo.decorator;

/**
 * @author pangliming
 * 衣柜
 */
class BoyDecorator extends Person{
    private Person person;

    public BoyDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void dress() {
        person.dress();
    }
}
