package com.topica.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import com.topica.model.Item;

/**
 *
 * @author thinh
 */
public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {

    @Query("SELECT o FROM Item o WHERE o.id = :id")
    List<Item> findById(@Param("id") int id, Pageable pageable);

    @Query("SELECT item FROM Item item join item.categorys c where c.name = :category")
    List<Item> findByCategory(@Param("category") String category, Pageable pageable);
}
