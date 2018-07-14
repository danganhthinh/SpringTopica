package com.topica.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import com.topica.model.Category;

/**
 *
 * @author thinh
 */
public interface CategoryReposity extends PagingAndSortingRepository<Category, Integer> {

    @Query("SELECT category FROM Category category join category.type type where type.name = :type")
    List<Category> findByType(@Param("type") String type, Pageable p);

}
