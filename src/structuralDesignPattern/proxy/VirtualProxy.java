package structuralDesignPattern.proxy;

interface IImage{
    void display();
}


class RealImage implements IImage{

    private String fileName;
    RealImage (String fileName){
        this.fileName = fileName;
        // some kind of heavy loading operation
        System.out.println("Loading image from disk: " + fileName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }

}

class ProxyImage implements IImage{

    private RealImage realImage;
    private String fileName;

    ProxyImage(String fileName){
        this.fileName = fileName;
        realImage = null;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
public class VirtualProxy {
    public static void main(String[] args) {

        IImage image1 = new ProxyImage("photo1.jpg");
        IImage image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded from disk only when display is called
        image1.display();
        image1.display(); // This time it won't load from disk

        image2.display();
    }
}
