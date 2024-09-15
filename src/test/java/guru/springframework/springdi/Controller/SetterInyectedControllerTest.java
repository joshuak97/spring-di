package guru.springframework.springdi.Controller;

import guru.springframework.springdi.controller.SetterInyectedController;
import guru.springframework.springdi.service.GreetingService;
import guru.springframework.springdi.service.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class SetterInyectedControllerTest {

    private static final Logger log = LoggerFactory.getLogger(SetterInyectedControllerTest.class);
    SetterInyectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInyectedController();
        controller.setGreetingService(new GreetingServiceImp());
    }

    @Test
    void greet() {
       log.info(controller.greet());
    }
}