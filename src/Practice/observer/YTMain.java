package Practice.observer;

public class YTMain {
    public static void main(String[] args) {

        YTChannel thinkSchool = new YTChannel();
        Subscriber subscriber1 = new EmailSubscriber("Anshul");
        Subscriber subscriber2 = new MobileSubscriber("Arpit");
        thinkSchool.addSubscriber(subscriber1);
        thinkSchool.addSubscriber(subscriber2);
        thinkSchool.addNewVideo("Zeta Case Study with HDFC");
    }
}
