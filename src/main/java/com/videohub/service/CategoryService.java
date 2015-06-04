package com.videohub.service;

import com.videohub.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

    List<Category> getCategories();

    List<Category> getCategory(String name);

    void addCategory(Category category);

    void addCategories(List<Category> categories);

    void deleteCategory(Category category);

    void deleteCategories(List<Category> categories);

    void deleteAllCategories();

}
