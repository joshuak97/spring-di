package guru.springframework.springdi.controller;

import guru.springframework.springdi.service.GreetingService;

public class SetterInyectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet() {
        return greetingService.greet();
    }
}
