package com.videohub.service;

import com.videohub.model.Category;

import java.util.List;

public interface CategoryService {

    public List<Category> getCategories();

    public void addCategory(Category category);

}
