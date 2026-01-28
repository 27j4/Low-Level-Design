package creationalDesignPattern.singleton;

public class SimpleSingleton {

    private static SimpleSingleton instance = null;

    private SimpleSingleton(){
        System.out.println("Singleton constructor called");
    }

    public static SimpleSingleton getInstance(){
        if(instance == null){
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
