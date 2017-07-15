package com.example.user.playingwithheadfirst;

/**
 * Created by User on 7/14/2017.
 */

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract void Display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks float. even decoys!");
    }
}
