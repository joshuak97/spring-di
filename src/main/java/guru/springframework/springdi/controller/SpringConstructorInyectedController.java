package guru.springframework.springdi.controller;

import guru.springframework.springdi.service.GreetingService;
import guru.springframework.springdi.service.GreetingSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * The Class ConstructorInyectedController
 *  In this controller we show an example of dependency injection without Spring through a constructor.
 */
@Controller
public class SpringConstructorInyectedController {

    private GreetingSpringService greetingService;

    @Autowired
    public SpringConstructorInyectedController(GreetingSpringService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
       return greetingService.greet();
    }

}
