package Singleton; /**
 * Created by steven on 07/05/2017.
 */

import java.io.Serializable;

public class SingletonProtected implements Serializable{

    private static SingletonProtected s = new SingletonProtected();

    private SingletonProtected(){
        if (s != null) {
            throw new IllegalStateException("this is already created");
        }
    }

    public static SingletonProtected getInstance(){
    return s;
    }

    // to stop cloning - override clone method of object
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone method overiiden");
    }

}
