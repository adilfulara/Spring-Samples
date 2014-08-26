package app.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

/**
 * Created by adilfulara on 8/24/14.
 */

@Component
public class HelloService {

    @ServiceActivator(inputChannel = "inputChannel", outputChannel = "outputChannel")
    public String helloWorld(String name) {
        return "Hello, " + name;
    }

}
