package app.domain;

import app.service.HelloService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import javax.annotation.PostConstruct;
import java.util.UUID;

/**
 * Created by adilfulara on 7/26/14.
 */
@Configurable(autowire = Autowire.BY_TYPE)
public class Hello {

    @Autowired
    private HelloService helloService;

    @PostConstruct
    protected void init() {
        helloService.sayHello(UUID.randomUUID().toString());
    }

}
