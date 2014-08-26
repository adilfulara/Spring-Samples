package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * Created by adilfulara on 8/25/14.
 */

@Service
public class FooService {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    public void init() {
        Assert.notNull(dataSource);
    }

}
