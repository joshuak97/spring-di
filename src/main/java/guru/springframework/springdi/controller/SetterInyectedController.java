package guru.springframework.springdi.controller;

import guru.springframework.springdi.service.GreetingService;

/**
 * The Class SetterInyectedController
 *  In this controller we show an example of dependency injection without Spring through a Setter.
 */
public class SetterInyectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return greetingService.greet();
    }
}
