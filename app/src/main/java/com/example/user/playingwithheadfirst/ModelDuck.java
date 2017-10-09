package com.example.user.playingwithheadfirst;

/**
 * Created by User on 7/16/2017.
 */

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public String Display() {
        return "I'm a model Duck";
    }
}
