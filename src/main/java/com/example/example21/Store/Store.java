package com.example.example21.Store;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Store {
    private List<Integer> items;

    public Store() {
        this.items = new ArrayList<>();
    }

    public List<Integer> addItems(List<Integer> idItems) {
        items.addAll(idItems);
        return idItems;
    }

    public List<Integer> getItems() {
        return items;
    }
}
