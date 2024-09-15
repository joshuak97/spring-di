package guru.springframework.springdi.controller;

import guru.springframework.springdi.service.GreetingSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * The Class PropertyInyectedController
 *  In this controller we show an example of dependency injection without Spring through a Property.
 */
@Controller
public class SpringPropertyInyectedController {

    @Qualifier("propertyGreetingSpringService")
    @Autowired
    public GreetingSpringService greetingSpringService;

    public String greeting() {
        return greetingSpringService.greet();
    }
}
