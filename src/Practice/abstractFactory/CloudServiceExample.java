package Practice.abstractFactory;

// ----------- Abstract Products -----------
interface StorageService {
    void storeData(int data);
}

interface ComputeService {
    void compute();
}

// ----------- Concrete Products (AWS) -----------
class AWSStorageService implements StorageService {
    public void storeData(int data) {
        System.out.println(data + " stored in AWS");
    }
}

class AWSComputeService implements ComputeService {
    public void compute() {
        System.out.println("AWS computing");
    }
}

// ----------- Concrete Products (Azure) -----------
class AzureStorageService implements StorageService {
    public void storeData(int data) {
        System.out.println(data + " stored in Azure");
    }
}

class AzureComputeService implements ComputeService {
    public void compute() {
        System.out.println("Azure computing");
    }
}

// ----------- Abstract Factory -----------
interface CloudFactory {
    StorageService createStorageService();
    ComputeService createComputeService();
}

// ----------- Concrete Factories -----------
class AWSFactory implements CloudFactory {

    public StorageService createStorageService() {
        return new AWSStorageService();
    }

    public ComputeService createComputeService() {
        return new AWSComputeService();
    }
}

class AzureFactory implements CloudFactory {

    public StorageService createStorageService() {
        return new AzureStorageService();
    }

    public ComputeService createComputeService() {
        return new AzureComputeService();
    }
}

// ----------- Client Code -----------
public class CloudServiceExample {

    public static void main(String[] args) {

        CloudFactory factory;

        String provider = "AWS"; // runtime decision

        if (provider.equalsIgnoreCase("AWS")) {
            factory = new AWSFactory();
        } else {
            factory = new AzureFactory();
        }

        StorageService storage = factory.createStorageService();
        ComputeService compute = factory.createComputeService();

        storage.storeData(100);
        compute.compute();
    }
}
