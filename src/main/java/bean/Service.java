package bean;

public class Service {
    private Writer write;

    public Service(Writer writer) {
        this.write = writer;
    }

    public void setWrite(Writer write) {
        this.write = write;
    }

    public void process(){
        write.write();
    }
}
