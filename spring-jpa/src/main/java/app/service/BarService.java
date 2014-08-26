package app.service;

import org.springframework.util.Assert;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * Created by adilfulara on 8/25/14.
 */
public class BarService {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @PostConstruct
    public void init() {
        Assert.notNull(dataSource);
    }
}
