package bg.tu_varna.sit.a1.f21621551;
public class App {
    public static void main(String[] args) throws Exception {
       
         
        Creator creator1 = new Creator("Twinkiecorn", "Salvatore");
        Creator creator2 = new Creator("BearDaddyUnicorn", "Salvatore");

        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        Subscriber sub3 = new Subscriber();
        ContentCreators creators1 = new ContentCreators(creator1);
        creators1.registerObserver(sub3);
        creators1.registerObserver(sub2);
        creators1.registerObserver(sub1);

        ContentCreators creators2 = new ContentCreators(creator1);
        creators2.registerObserver(sub2);
        creators2.registerObserver(sub1);


        creators1.addNewVideo(creator1, "How to play Unstable Unicorns");
        creators1.unregisterObserver(sub3);
        creators1.addNewVideo(creator1, "How to play Ticket to Ride");
        creators2.addNewVideo(creator2, "How to play Happy Little Dinosaurs");
    }
}
