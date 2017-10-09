package com.example.user.playingwithheadfirst;

/**
 * Created by User on 7/14/2017.
 */

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public String Display() {
        return "I'm a real mallard duck";
    }
}
