package com.refresh.refresh18.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.refresh.refresh18.data.repositories")
@Configuration
public class MongoDbConfig {}
