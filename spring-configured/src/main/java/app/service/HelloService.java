package app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by adilfulara on 7/26/14.
 */
@Service
public class HelloService {

    public static final Logger logger = LoggerFactory.getLogger(HelloService.class);

    public void sayHello(String text) {
        logger.info("Hello World !! " + text);
    }
}
