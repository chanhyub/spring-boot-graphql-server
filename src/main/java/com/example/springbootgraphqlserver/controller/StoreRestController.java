package com.example.springbootgraphqlserver.controller;

import com.example.springbootgraphqlserver.entity.Product;
import com.example.springbootgraphqlserver.entity.Store;
import com.example.springbootgraphqlserver.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StoreRestController {
    private final StoreService storeService;


    @QueryMapping
    public Store getStore() {
        return storeService.getStore(1L);
    }

    @QueryMapping
    public Product getProduct() {
        return storeService.getProduct(1L);
    }

    @QueryMapping
    public List<Store> getStores() {
        return storeService.getStores();
    }

    @QueryMapping
    public List<Product> getProducts() {
        return storeService.getProducts();
    }
}
