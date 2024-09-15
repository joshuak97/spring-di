package guru.springframework.springdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingSpringService implements GreetingSpringService {

    @Override
    public String greet() {
        return "Hello world!! --Primary Bean";
    }
}
