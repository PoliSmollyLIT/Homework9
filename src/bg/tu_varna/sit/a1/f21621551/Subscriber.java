package bg.tu_varna.sit.a1.f21621551;

public class Subscriber implements Observer{
    private String videoTitle;
    private Creator creatorName;

    @Override
    public void update(String videoTitile, Creator creator) {
        this.videoTitle = videoTitile;
        this.creatorName = creator;
        display();
    }
    
    public void display(){
        System.out.println(creatorName.toString() + " just postet new video. It is about " + videoTitle);
    }
    
}