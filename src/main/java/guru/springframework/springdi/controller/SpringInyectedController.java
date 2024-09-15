package guru.springframework.springdi.controller;

import guru.springframework.springdi.service.GreetingService;
import guru.springframework.springdi.service.GreetingSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * The Class PropertyInyectedController
 *  In this controller we show an example of dependency injection without Spring through a Property.
 */
@Controller
public class SpringInyectedController {

    @Autowired
    public GreetingSpringService greetingSpringService;

    public String greeting() {
        return greetingSpringService.greet();
    }
}
