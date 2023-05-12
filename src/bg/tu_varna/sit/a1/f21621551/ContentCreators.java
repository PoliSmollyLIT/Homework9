package bg.tu_varna.sit.a1.f21621551;

import java.util.ArrayList;

public class ContentCreators implements Subject{
    private Creator creator;
    private String videoTitle;
    private ArrayList<Observer> observers;

    

    public ContentCreators(Creator creator) {
        observers = new ArrayList<>();
        this.creator = creator;
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(videoTitle, creator);
        }
        
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }
    
    
    
    public void checkForNewVideos(){
      
        notifyObservers();
    }

    public void addNewVideo(Creator creator, String videoTitle) {
        this.creator = creator;
        this.videoTitle = videoTitle;
        notifyObservers();
    }

}