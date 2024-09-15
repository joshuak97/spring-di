package guru.springframework.springdi.controller;

import guru.springframework.springdi.service.GreetingService;

public class ConstructorInyectedController {

    private GreetingService greetingService;

    public ConstructorInyectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
       return greetingService.greet();
    }

}
