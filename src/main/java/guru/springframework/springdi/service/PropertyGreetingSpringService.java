package guru.springframework.springdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingSpringService implements GreetingSpringService {

    @Override
    public String greet() {
        return "Hello world!! --Property";
    }
}
