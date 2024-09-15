package guru.springframework.springdi.Controller;

import guru.springframework.springdi.controller.PropertyInyectedController;
import guru.springframework.springdi.service.GreetingService;
import guru.springframework.springdi.service.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertyInyectedControllerTest {

    private static final Logger log = LoggerFactory.getLogger(PropertyInyectedControllerTest.class);

    PropertyInyectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInyectedController();

        controller.greetingService = new GreetingServiceImp();
    }

    @Test
    void greeting() {
        log.info(controller.greeting());
    }



}
