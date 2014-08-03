package app;

import app.domain.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

/**
 * Created by adilfulara on 7/26/14.
 */
@Configuration
@EnableSpringConfigured
@ComponentScan("app")
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        new Hello();
        new Hello();
    }

}
