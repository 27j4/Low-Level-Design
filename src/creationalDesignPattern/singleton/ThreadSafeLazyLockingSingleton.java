package creationalDesignPattern.singleton;

public class ThreadSafeLazyLockingSingleton {

    private static ThreadSafeLazyLockingSingleton instance = null;

    private ThreadSafeLazyLockingSingleton(){
        System.out.println("Singleton Constructor called");
    }

    public synchronized static ThreadSafeLazyLockingSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeLazyLockingSingleton();
        }
        return instance;
    }
}
