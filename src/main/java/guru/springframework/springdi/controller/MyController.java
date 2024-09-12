package guru.springframework.springdi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    private static final Logger log = LoggerFactory.getLogger(MyController.class);

    public String sayHello() {
        log.info("Hello Folks!");
        return "Hello World";
    }

}
