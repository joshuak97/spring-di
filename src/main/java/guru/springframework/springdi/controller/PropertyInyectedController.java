package guru.springframework.springdi.controller;

import guru.springframework.springdi.service.GreetingService;

/**
 * The Class PropertyInyectedController
 *  In this controller we show an example of dependency injection without Spring through a Property.
 */
public class PropertyInyectedController {

    public GreetingService greetingService;

    public String greeting() {
        return greetingService.greet();
    }
}
