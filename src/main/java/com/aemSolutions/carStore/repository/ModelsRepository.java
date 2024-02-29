package com.aemSolutions.carStore.repository;

import com.aemSolutions.carStore.entity.Models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelsRepository extends JpaRepository<Models, Integer> {
}
