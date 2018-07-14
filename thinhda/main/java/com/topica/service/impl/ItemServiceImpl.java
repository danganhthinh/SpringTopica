package com.topica.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.topica.model.Item;
import com.topica.service.ItemService;
import com.topica.repository.ItemRepository;

/**
 *
 * @author thinh
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> findByCategory(String category, int pageIndex, int pageSize) {
        return itemRepository.findByCategory(category, PageRequest.of(pageIndex, pageSize));
    }
}
