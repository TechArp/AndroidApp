package com.example.user.playingwithheadfirst;

/**
 * Created by User on 7/15/2017.
 */

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
