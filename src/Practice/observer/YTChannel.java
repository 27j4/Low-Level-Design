package Practice.observer;

import java.util.ArrayList;
import java.util.List;

public class YTChannel implements Channel{

    List<Subscriber> list;
    private String latestVideo;

    public YTChannel(){
        list = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        list.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        list.remove(subscriber);
    }

    public void addNewVideo(String videoName){
        this.latestVideo = videoName;
        notifyAllSubscriber();
    }

    @Override
    public void notifyAllSubscriber() {
        for(Subscriber subscriber : list){
            subscriber.update(this.latestVideo);
        }
    }
}
