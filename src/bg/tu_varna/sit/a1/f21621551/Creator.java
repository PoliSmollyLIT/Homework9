package bg.tu_varna.sit.a1.f21621551;

public class Creator {
    private String firstName;
    private String lastName;
    public Creator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
        
}