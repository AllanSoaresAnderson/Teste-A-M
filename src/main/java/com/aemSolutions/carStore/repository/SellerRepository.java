package com.aemSolutions.carStore.repository;

import com.aemSolutions.carStore.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Integer> {
}
