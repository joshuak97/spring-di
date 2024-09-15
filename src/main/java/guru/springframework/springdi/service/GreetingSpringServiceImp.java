package guru.springframework.springdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingSpringServiceImp implements GreetingSpringService {

    @Override
    public String greet() {
        return "Hello world!! ";
    }
}
