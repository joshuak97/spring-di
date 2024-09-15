package guru.springframework.springdi.Controller;

import guru.springframework.springdi.controller.ConstructorInyectedController;
import guru.springframework.springdi.service.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInyectedControllerTest {

    private static final Logger log = LoggerFactory.getLogger(ConstructorInyectedControllerTest.class);
    ConstructorInyectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInyectedController(new GreetingServiceImp());
    }

    @Test
    void sayHello() {
        log.info(controller.sayHello());
    }
}