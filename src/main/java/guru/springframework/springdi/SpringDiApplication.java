package guru.springframework.springdi;

import guru.springframework.springdi.controller.MyController;
import guru.springframework.springdi.controller.SpringConstructorInyectedController;
import guru.springframework.springdi.controller.SpringPropertyInyectedController;
import guru.springframework.springdi.controller.SpringSetterInyectedController;
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

        MyController myController = context.getBean("myController", MyController.class);

        String greeting = myController.sayHello();

        log.info(greeting);

        log.info("******** DI With Spring Property ***********");

        var controllerSpringProperty = context.getBean("springPropertyInyectedController", SpringPropertyInyectedController.class);
        log.info(controllerSpringProperty.greeting());

        log.info("******** DI With Spring Setter ***********");

        var controllerSpringSetter = context.getBean("springSetterInyectedController", SpringSetterInyectedController.class);
        log.info(controllerSpringSetter.greet());

        log.info("******** DI With Spring Constructor ***********");

        var controllerSpringConstructor = context.getBean("springConstructorInyectedController", SpringConstructorInyectedController.class);
        log.info(controllerSpringConstructor.sayHello());
    }

}
