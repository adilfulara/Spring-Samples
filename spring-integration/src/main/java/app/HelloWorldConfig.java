package app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

/**
 * Created by adilfulara on 8/24/14.
 */
@Configuration
@EnableAutoConfiguration
@EnableIntegration
@ComponentScan
public class HelloWorldConfig {


    @Bean
    @Qualifier("inputChannel")
    public MessageChannel inputChannel() {
        DirectChannel channel = new DirectChannel();
        return channel;
    }

    @Bean
    @Qualifier("outputChannel")
    public MessageChannel outputChannel() {
        QueueChannel channel = new QueueChannel(10);
        return channel;
    }

}
