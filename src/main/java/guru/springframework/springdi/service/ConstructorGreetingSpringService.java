package guru.springframework.springdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingSpringService implements GreetingSpringService {

    @Override
    public String greet() {
        return "Hello world!! -- Constructor ";
    }
}
