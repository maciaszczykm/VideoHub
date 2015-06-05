package com.videohub.service.impl;

import com.videohub.model.Category;
import com.videohub.repository.CategoryRepository;
import com.videohub.service.CategoryService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private static final Logger LOGGER = LogManager.getLogger(CategoryServiceImpl.class);

    @Qualifier("categoryRepository")
    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryRepository getCategoryRepository() {
        return categoryRepository;
    }

    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public List<Category> getCategory(String name) {
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
