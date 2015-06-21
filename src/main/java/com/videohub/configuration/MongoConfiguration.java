package com.videohub.configuration;

import com.google.common.collect.Lists;
import com.mongodb.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

/**
 * Created by: GiBSoN.
 * Created on: 2015-06-04.
 */
@Configuration
@EnableMongoRepositories(value = "com.videohub.repository")
public class MongoConfiguration extends AbstractMongoConfiguration {

    private static final String DB_NAME = "videohub";
    private static final String DEV_IP = "localhost";
    private static final String IP = "127.8.168.2";
    private static final short PORT = 27017;
    private static final String BASE_PACKAGE = "com.videohub.model";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "HPcbQt8PQJIa";

    @Override
    protected String getDatabaseName() {
        return DB_NAME;
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(getAddress(), getUserCredentialList());
    }

    @Override
    protected String getMappingBasePackage() {
        return BASE_PACKAGE;
    }

    private ServerAddress getAddress() {
        return new ServerAddress(IP.isEmpty() ? DEV_IP : IP, PORT);
    }

    private List<MongoCredential> getUserCredentialList() {
        return Lists.newArrayList(MongoCredential.createCredential(USERNAME, DB_NAME, PASSWORD.toCharArray()));
    }
}
