package com.example.user.playingwithheadfirst;

/**
 * Created by User on 7/14/2017.
 */

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract String Display();

    public String performQuack(){

        return quackBehavior.quack();
    }

    public String performFly(){

        return flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior pFlyBehavior){

        flyBehavior = pFlyBehavior;
    }


    public void setQuackBehavior(QuackBehavior pQuackBehavior){

        quackBehavior = pQuackBehavior;
    }

    public String swim(){
        return "All ducks float. even decoys!";
    }
}
