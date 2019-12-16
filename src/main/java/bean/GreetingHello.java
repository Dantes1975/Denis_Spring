package bean;

public class GreetingHello implements Greeting {

private String message;

    public GreetingHello(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getGreeting() {
        return message;
    }
}


