package com.example.example21.Controller;

import com.example.example21.Service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public List<Integer> addItem(@RequestParam List<Integer> id) {
        return storeService.addItems(id);
    }

    @GetMapping("/get")
    public List<Integer> getItem() {
        return storeService.getList();
    }
}
