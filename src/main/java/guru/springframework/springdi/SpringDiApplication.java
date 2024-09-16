package guru.springframework.springdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDiApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringDiApplication.class);

    public static void main(String[] args) { SpringApplication.run(SpringDiApplication.class, args); }

}
