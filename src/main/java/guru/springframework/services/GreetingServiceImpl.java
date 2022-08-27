package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_PPL = "Hello People!!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_PPL;
    }
}
