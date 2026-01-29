package Practice;


// normal example


class GetSingleInstance {

    // MUST be volatile
    private static volatile GetSingleInstance getSingleInstance;

    private GetSingleInstance() {
        System.out.println("Getting the instance");
    }

    public static GetSingleInstance getInstance() {
        if (getSingleInstance == null) {               // 1st check
            synchronized (GetSingleInstance.class) {
                if (getSingleInstance == null) {       // 2nd check
                    getSingleInstance = new GetSingleInstance();
                }
            }
        }
        return getSingleInstance;
    }
}

public class Singleton {
    public static void main(String[] args) {

        GetSingleInstance instance1 = GetSingleInstance.getInstance();
        GetSingleInstance instance2 = GetSingleInstance.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
