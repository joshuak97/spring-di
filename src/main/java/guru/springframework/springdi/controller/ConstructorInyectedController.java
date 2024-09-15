package guru.springframework.springdi.controller;

import guru.springframework.springdi.service.GreetingService;

/**
 * The Class ConstructorInyectedController
 *  In this controller we show an example of dependency injection without Spring through a constructor.
 */
public class ConstructorInyectedController {

    private GreetingService greetingService;

    public ConstructorInyectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
       return greetingService.greet();
    }

}
