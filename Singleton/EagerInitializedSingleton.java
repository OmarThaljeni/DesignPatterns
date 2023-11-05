package Singleton;

public class EagerInitializedSingleton {
    /** private constructor to prevent others from instantiating this class */
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

}
