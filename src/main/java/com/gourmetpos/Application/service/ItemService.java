package com.gourmetpos.Application.service;

import com.gourmetpos.Application.dao.ItemDao;
import com.gourmetpos.Application.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


@Service
public class ItemService {

    @Autowired
    ItemDao itemdao;

    public List<Item> getItemDetails() {
        return itemdao.findAll();
    }

    public List<Item> getItemDetailsByName(String name) {
        return itemdao.findByName(name);
    }

    public List<Item> getItemDetailsByprice(BigDecimal price) {
        return itemdao.findByPrice(price);
    }
}
