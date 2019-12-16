package bean;

import java.util.List;

public class GreetingService {

    private List<Greeting> greetings;

    public GreetingService() {
    }

    public GreetingService(List<Greeting> greetings) {
        this.greetings = greetings;
    }

    public void setGreetings(List<Greeting> greetings) {
        this.greetings = greetings;
    }

    public void process() {
        for (Greeting greet : greetings
        ) {
            System.out.println(greet.getGreeting());
        }
    }
}
