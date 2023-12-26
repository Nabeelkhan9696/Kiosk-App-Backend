package com.gourmetpos.Application.dao;

import com.gourmetpos.Application.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {

     List<Item> findByName(String name);
     List<Item> findByPrice(BigDecimal price);

}
