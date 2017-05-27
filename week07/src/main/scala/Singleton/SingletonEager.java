package Singleton;

/**
 * Created by steven on 07/05/2017.
 */
public class SingletonEager {

    private static SingletonEager singleton = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance() {
        return singleton;
    }

}
