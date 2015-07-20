/*
 * Copyright 2015 Sebastian Florek and Marcin Maciaszczyk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.videohub.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by: Sebastian Florek.
 * Created on: 2015-06-04.
 */
@Configuration
@EnableMongoRepositories(value = "com.videohub.repository")
public class MongoConfiguration extends AbstractMongoConfiguration {

    @Value("${mongodb.name}")
    private String DB_NAME;

    @Value("${mongodb.dev.ip}")
    private String DEV_IP;

    @Value("${mongodb.ip:}")
    private String IP;

    @Value("${mongodb.port}")
    private Short PORT;

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

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
