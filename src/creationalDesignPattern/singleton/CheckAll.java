import creationalDesignPattern.singleton.*;

void main(){
    System.out.println("No Singleton :: Check");

    NoSingleton noSingleton1 = new NoSingleton();
    NoSingleton noSingleton2 = new NoSingleton();
    System.out.println(noSingleton1.equals(noSingleton2));

    System.out.println("Simple Singleton :: Check");
    SimpleSingleton s1 = SimpleSingleton.getInstance();
    SimpleSingleton s2 = SimpleSingleton.getInstance();
    System.out.println(s1.equals(s2));


    System.out.println("ThreadSafeLazyLockingSingleton Singleton :: Check");
    ThreadSafeLazyLockingSingleton t1 = ThreadSafeLazyLockingSingleton.getInstance();
    ThreadSafeLazyLockingSingleton t2 = ThreadSafeLazyLockingSingleton.getInstance();
    System.out.println(t1.equals(t2));


    System.out.println("ThreadSafeLazyDoubleLockingSingleton Singleton :: Check");
    ThreadSafeLazyDoubleLockingSingleton g1 = ThreadSafeLazyDoubleLockingSingleton.getInstance();
    ThreadSafeLazyDoubleLockingSingleton g2 = ThreadSafeLazyDoubleLockingSingleton.getInstance();
    System.out.println(g1.equals(g2));

    System.out.println("ThreadSafeEagerSingleton Singleton :: Check");
    ThreadSafeEagerSingleton e1 = ThreadSafeEagerSingleton.getInstance();
    ThreadSafeEagerSingleton e2 = ThreadSafeEagerSingleton.getInstance();
    System.out.println(e1.equals(e2));
}