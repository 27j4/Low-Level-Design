package Practice.observer;

public class EmailSubscriber implements Subscriber{
    private String subName;

    public EmailSubscriber(String subName) {
        this.subName = subName;
    }

    @Override
    public void update(String videoName){
        System.out.printf("New notification is send via Email, VideoName: %s to %s", videoName, this.subName);
        System.out.println();
    }
}
