package Singleton;

/**
 * Created by steven on 07/05/2017.
 */
public class SingletonLazy {

    //lazy
    private static SingletonLazy singleton = null;

    //eager - can be expensive with synchronized


    //private constructor
    private SingletonLazy() {
    }


    private static SingletonLazy getInstance() {
        return singleton;
    }

}