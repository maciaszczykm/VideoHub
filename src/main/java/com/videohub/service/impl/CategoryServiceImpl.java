package com.videohub.service.impl;

import com.videohub.model.Category;
import com.videohub.repository.CategoryRepository;
import com.videohub.service.CategoryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private static final Logger LOGGER = Logger.getLogger(CategoryServiceImpl.class);

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public List<Category> getCategories(String name) {
        return categoryRepository.findByName(name);
    }

    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    public void addCategories(List<Category> categories) {
        categoryRepository.save(categories);
    }

    public void deleteCategory(Category category) {
        categoryRepository.delete(category);
    }

    public void deleteCategories(List<Category> categories) {
        categoryRepository.delete(categories);
    }

    public void deleteAllCategories() {
        categoryRepository.deleteAll();
    }

}
