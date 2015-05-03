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

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> getCategories(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void addCategories(List<Category> categories) {
        categoryRepository.save(categories);
    }

    @Override
    public void deleteCategory(Category category) {
        categoryRepository.delete(category);
    }

    @Override
    public void deleteCategories(List<Category> categories) {
        categoryRepository.delete(categories);
    }

    @Override
    public void deleteAllCategories() {
        categoryRepository.deleteAll();
    }

}
