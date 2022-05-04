package com.example.example21.Service;

import com.example.example21.Store.Store;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private final Store store;

    public StoreServiceImpl(Store store) {
        this.store = store;
    }

    @Override
    public List<Integer> addItems(List<Integer> idItem) {
        store.addItems(idItem);
        return idItem;
    }

    @Override
    public List<Integer> getList() {
        return store.getItems();
    }
}
