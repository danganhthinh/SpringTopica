package com.topica.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.topica.model.Category;
import com.topica.repository.CategoryReposity;
import com.topica.service.CategoryService;

/**
 *
 * @author thinh
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryReposity category;

    @Override
    public List<Category> findByType(String type, int pageIndex, int pageSize) {
        return category.findByType(type, PageRequest.of(pageIndex, pageSize));
    }

    @Override
    public void update(Integer id, String name) {

    }

}
