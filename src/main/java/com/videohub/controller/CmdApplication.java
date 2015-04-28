package com.videohub.controller;

import com.videohub.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CmdApplication implements CommandLineRunner {

    @Autowired
    CategoryRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(CmdApplication.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        repository.save(new Category(1L, "New"));
    }

}
