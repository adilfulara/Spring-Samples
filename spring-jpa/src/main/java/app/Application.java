package app;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.Assert;

import javax.sql.DataSource;

/**
 * Created by adilfulara on 8/25/14.
 */
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Config.class);
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        Assert.notNull(dataSource);
    }

}
