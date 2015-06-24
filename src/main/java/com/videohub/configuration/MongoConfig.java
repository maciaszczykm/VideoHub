package com.videohub.configuration;

import com.google.common.collect.Lists;
import com.mongodb.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@Configuration
@EnableMongoRepositories(value = "com.videohub.repository")
@PropertySource("classpath:db.properties")
public class MongoConfig extends AbstractMongoConfiguration {

    private static final String BASE_PACKAGE = "com.videohub.model";

    @Value("${mongodb.db}")
    private String DB_NAME;

    @Value("${mongodb.url}")
    private String IP;

    @Value("${mongodb.port}")
    private Integer PORT;

    @Value("${mongodb.username:}")
    private String USERNAME;

    @Value("${mongodb.password:}")
    private String PASSWORD;

    @Override
    protected String getDatabaseName() {
        return DB_NAME;
    }

    @Override
    public Mongo mongo() throws Exception {
        return USERNAME.isEmpty() || PASSWORD.isEmpty() ?
                new MongoClient(getAddress()) :
                new MongoClient(getAddress(), getUserCredentialList());
    }

    @Override
    protected String getMappingBasePackage() {
        return BASE_PACKAGE;
    }

    private ServerAddress getAddress() {
        return new ServerAddress(IP, PORT);
    }

    private List<MongoCredential> getUserCredentialList() {
        return Lists.newArrayList(MongoCredential.createCredential(USERNAME, DB_NAME, PASSWORD.toCharArray()));
    }
}
