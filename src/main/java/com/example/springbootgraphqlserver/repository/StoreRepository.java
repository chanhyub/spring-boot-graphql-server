package com.example.springbootgraphqlserver.repository;

import com.example.springbootgraphqlserver.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long>{
}
