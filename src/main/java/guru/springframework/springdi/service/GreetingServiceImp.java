package guru.springframework.springdi.service;

public class GreetingServiceImp implements GreetingService {

    @Override
    public String greet() {
        return "Hello world!! ";
    }
}
