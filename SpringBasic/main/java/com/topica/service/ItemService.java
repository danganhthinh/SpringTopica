package com.topica.service;

import java.util.List;
import com.topica.model.Item;

/**
 *
 * @author thinh
 */
public interface ItemService {

    List<Item> findByCategory(String category, int pageIndex, int pageSize);
}
