package Practice.observer;

public class MobileSubscriber implements Subscriber{

    private String subName;

    public MobileSubscriber(String subsName) {
        this.subName = subsName;
    }

    @Override
    public void update(String videoName) {
        System.out.printf("New notification is send via Mobile VideoName: %s to %s", videoName, this.subName);
        System.out.println();
    }
}
