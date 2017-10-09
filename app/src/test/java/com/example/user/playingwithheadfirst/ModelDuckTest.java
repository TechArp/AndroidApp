package com.example.user.playingwithheadfirst;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 7/23/2017.
 */
public class ModelDuckTest {
    @Test
    public void display() throws Exception {
        System.out.println("ModelDuck Test : Started.");


        Duck mallard = new MallardDuck();

        System.out.println(mallard.performQuack());
        System.out.println(mallard.performFly());

        Duck model = new ModelDuck();
        System.out.println(model.performFly());

        model.setFlyBehavior(new FlyRocketPowered());

        System.out.println(model.performFly());



        System.out.println("ModelDuck Test : Ended.");
    }

}