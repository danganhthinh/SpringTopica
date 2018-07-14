package com.topica.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.topica.model.Category;

/**
 *
 * @author thinh
 */
@Service
public interface CategoryService {

    List<Category> findByType(String type, int pageIndex, int pageSize);

    void update(Integer id, String name);
}
