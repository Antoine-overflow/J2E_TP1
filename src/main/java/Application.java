import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //var printer = new SimpleMessagePrinter();
        SimpleMessagePrinter smp = (SimpleMessagePrinter)context.getBean("SimpleMessagePrinter");
        smp.printMessage();
    }
    
}