package guru.springframework.springdi.controller;

import guru.springframework.springdi.service.GreetingSpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {

    private GreetingSpringService greetingSpringService;

    @Autowired
    public I18NController(@Qualifier("i18nService") GreetingSpringService greetingSpringService) {
        this.greetingSpringService = greetingSpringService;
    }

    public String sayGreeting() {
        return greetingSpringService.greet();
    }
}
