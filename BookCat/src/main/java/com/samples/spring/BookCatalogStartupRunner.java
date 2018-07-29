package com.samples.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Arrays;

@Component
class BookCatalogStartupRunner implements CommandLineRunner {

    private static Log logger = LogFactory.getLog(BookCatalogStartupRunner.class);

    private DataSource dataSource;

    @Autowired
    BookCatalogStartupRunner(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void run(String... args) throws Exception {
        logger.info("Starting Book catalog with commands: " + Arrays.toString(args));
        logger.info("Data source config : " + dataSource.toString());
    }
}
