package guru.springframework.springdi;

import guru.springframework.springdi.controller.MyController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringDiApplication.class);

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");

        String greeting = myController.sayHello();

        log.info(greeting);
    }

}
