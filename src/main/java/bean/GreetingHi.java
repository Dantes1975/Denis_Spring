package bean;

public class GreetingHi implements Greeting {
    private String message;

    public GreetingHi(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getGreeting() {
        return message;
    }
}
