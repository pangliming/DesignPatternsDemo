package com.example.designpatternsdemo.decorator;

/**
 * @author pangliming
 * 家居
 */
public class BoyHomeDecorator extends BoyDecorator{
    public BoyHomeDecorator(Person person) {
        super(person);
    }

    @Override
    public void dress() {
        System.out.println("Home:");
        super.dress();
        dressShorts();
        dressVest();
        dressFlipFlops();
    }


    /**
     * shorts
     */
    public void dressShorts(){
        System.out.println("先穿上短裤");
    }

    /**
     * Vest
     */
    public void dressVest(){
        System.out.println("再穿上背心");
    }

    /**
     * 人字拖
     */
    public void dressFlipFlops(){
        System.out.println("最后穿上人字拖");
    }
}
