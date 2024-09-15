package guru.springframework.springdi.controller;

import guru.springframework.springdi.service.GreetingService;
import guru.springframework.springdi.service.GreetingSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * The Class SetterInyectedController
 *  In this controller we show an example of dependency injection without Spring through a Setter.
 */
@Controller
public class SpringSetterInyectedController {

    private GreetingSpringService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingSpringService") GreetingSpringService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return greetingService.greet();
    }
}
