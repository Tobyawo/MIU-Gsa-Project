package com.miu.gsa.project.repository;

import com.miu.gsa.project.entity.Supplier;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}

