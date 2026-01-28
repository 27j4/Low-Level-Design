package creationalDesignPattern.singleton;

public class ThreadSafeEagerSingleton {

    private static ThreadSafeEagerSingleton instance = new ThreadSafeEagerSingleton();

    private ThreadSafeEagerSingleton(){
        System.out.println("Single constructor called");
    }

    public static ThreadSafeEagerSingleton getInstance(){
        return instance;
    }
}
