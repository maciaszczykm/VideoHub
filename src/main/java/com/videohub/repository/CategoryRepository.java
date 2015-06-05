package com.videohub.repository;

import com.videohub.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends MongoRepository<Category, Long> {

    List<Category> findByName(String name);

}
