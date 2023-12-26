package com.gourmetpos.Application.controller;

import com.gourmetpos.Application.model.Item;
import com.gourmetpos.Application.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("kiosk")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("OrderDetails")
    public List<Item> getOrderDetails() {
        return itemService.getItemDetails();
    }

    @GetMapping("name/{name}")
    public List<Item> getItemByName(@PathVariable String name){
        return itemService.getItemDetailsByName(name);
    }

    @GetMapping("price/{price}")
    public List<Item> getItemByprice(@PathVariable BigDecimal price){
        return itemService.getItemDetailsByprice(price);
    }

}
