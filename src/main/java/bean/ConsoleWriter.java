package bean;

public class ConsoleWriter implements Writer {
    private String message = "Hello World";
    public void write() {
        System.out.println(message);
    }
}
