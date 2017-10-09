package com.example.myfirstapp;

/**
 * Created by User on 7/16/2017.
 */

public class singletonEventManager {
    private static final singletonEventManager ourInstance = new singletonEventManager();
    private static String duckSubclassName ="";

    static singletonEventManager getInstance() {
        return ourInstance;
    }

    private singletonEventManager() {
    }


    public static String getDuckSubclassName() {
        synchronized(singletonEventManager.class) {
            return ourInstance.duckSubclassName;
        }
    }


    public static void setDuckSubclassName(String pDuckSubclassName) {
        synchronized(singletonEventManager.class) {
            duckSubclassName = pDuckSubclassName;
        }
    }
}
