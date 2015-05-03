package com.videohub.controller;

import com.videohub.model.Category;
import com.videohub.service.CategoryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class ResourceController {

    private static final Logger LOGGER = Logger.getLogger(ResourceController.class);

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/resource")
    public Map<String,Object> home() {
        categoryService.addCategory(new Category("Sport"));
        categoryService.addCategory(new Category("Music"));
        LOGGER.info(categoryService.getCategories());
        Map<String,Object> model = new HashMap<>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }

}
