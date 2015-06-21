package com.videohub.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by: GiBSoN.
 * Created on: 2015-06-04.
 */
@Configuration
@EnableMongoRepositories(value = "com.videohub.repository")
public class MongoConfiguration extends AbstractMongoConfiguration {

    private static final String DB_NAME = "videohub";
    private static final String DEV_IP = "127.8.168.2";
    private static final String IP = "";
    private static final short PORT = 27017;
    private static final String BASE_PACKAGE = "com.videohub.model";

    @Override
    protected String getDatabaseName() {
        return DB_NAME;
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(IP.isEmpty() ? DEV_IP : IP, PORT);
    }

    @Override
    protected String getMappingBasePackage() {
        return BASE_PACKAGE;
    }
}
