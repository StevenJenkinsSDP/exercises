package Singleton;

/**
 * Created by steven on 07/05/2017.
 */
public class SingletonDoubleCheckLock {

    private volatile static SingletonDoubleCheckLock s = null;

    private SingletonDoubleCheckLock(){}


    public static SingletonDoubleCheckLock getInstance() {
        if (s == null) {
            synchronized (SingletonDoubleCheckLock.class) {
                if (s == null) {
                    s = new SingletonDoubleCheckLock();

                }
            }
        }
        return s;
    }

}
