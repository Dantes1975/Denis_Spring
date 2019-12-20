import bean.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:SpringConfig.xml");

//        Service service = (Service) applicationContext.getBean("Service");
//        service.process();

        GreetingService greetingService = (GreetingService) applicationContext.getBean("greetingService");
        greetingService.process();

//        Writer writer = new ConsoleWriter();
//        Service service = new Service(writer);
//        writer.write();
//        service.process();

    }
}
