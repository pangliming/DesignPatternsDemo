package com.example.designpatternsdemo.decorator;

/**
 * @author pangliming
 * 正装 uniform
 */
public class BoyUniformDecorator extends BoyDecorator{

    public BoyUniformDecorator(Person person) {
        super(person);
    }


    @Override
    public void dress() {
        System.out.println("Uniform:");
        super.dress();
        dressPants();
        dressBlouse();
        dressLeatherShoes();
    }


    public void dressPants(){
        System.out.println("先穿西裤！");
    }

    public void dressBlouse(){
        System.out.println("再穿衬衫！");
    }

    public void dressLeatherShoes(){
        System.out.println("最后穿皮鞋！");
    }

}
