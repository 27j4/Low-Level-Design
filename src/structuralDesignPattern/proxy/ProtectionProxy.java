package structuralDesignPattern.proxy;
// Protection Proxy Example
interface IDocumentReader{
    void readDocument(String file, String password);
}

class RealDocumentReader implements IDocumentReader{
    @Override
    public void readDocument(String file, String password) {
        System.out.println("Reading document: " + file);
    }
}
class DocumentProxy implements IDocumentReader{

    private RealDocumentReader realDocumentReader;
    private User user;

    DocumentProxy(User user){
        this.user = user;
        realDocumentReader = new RealDocumentReader();
    }

    @Override
    public void readDocument(String file, String password) {
        if(user.isPremium()){
            realDocumentReader.readDocument(file, password);
        } else {
            System.out.println("Access denied !! This document is available for premium users only.");
        }
    }
}

class User{
    private String name;
    private boolean isPremium;

    public User(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
    }

    public boolean isPremium() {
        return isPremium;
    }
}

public class ProtectionProxy {

    public static void main(String[] args) {
        User regularUser = new User("Alice", false);
        User premiumUser = new User("Bob", true);

        System.out.println("--- Regular User Trying to Access Document ---");
        IDocumentReader documentReader = new DocumentProxy(regularUser);
        documentReader.readDocument("confidential.pdf", "password123");

        System.out.println("\n--- Premium User Trying to Access Document ---");
        IDocumentReader documentReaderPremium = new DocumentProxy(premiumUser);
        documentReaderPremium.readDocument("confidential.pdf", "password123");

    }
}
