package creationalDesignPattern.singleton;

public class ThreadSafeLazyDoubleLockingSingleton {
    private static ThreadSafeLazyDoubleLockingSingleton instance = null;

    private ThreadSafeLazyDoubleLockingSingleton() {
        System.out.println("Single constructor called");
    }

    public static ThreadSafeLazyDoubleLockingSingleton getInstance() {
        if(instance == null){ // first check (no locking){
            synchronized (ThreadSafeEagerSingleton.class){ // locks only if needed
                if(instance == null){
                    instance = new ThreadSafeLazyDoubleLockingSingleton();
                }
            }
        }
        return instance;
    }
}
