package com.valuventory.controller;

import com.valuventory.entity.Item;
import com.valuventory.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public Item create(@RequestBody Item item) {
        return itemService.save(item);
    }

    @GetMapping
    public List<Item> findAll() {
        return itemService.findAll();
    }
}
