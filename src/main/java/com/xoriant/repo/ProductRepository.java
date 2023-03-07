package com.xoriant.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xoriant.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<ProductRepo, Integer> {


}
