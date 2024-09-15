package guru.springframework.springdi.controller;

import guru.springframework.springdi.service.GreetingService;

public class PropertyInyectedController {

    public GreetingService greetingService;

    public String greeting() {
        return greetingService.greet();
    }
}
