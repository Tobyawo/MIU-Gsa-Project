package com.miu.gsa.project.repository;

import com.miu.gsa.project.entity.Product;
import com.miu.gsa.project.entity.dto.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


    @Query("SELECT p FROM Product p WHERE p.productId = ?1")
    Optional<ProductDTO> findByProductId(Long id);

    @Query("SELECT p FROM Product p ORDER BY p.name ASC")
    List<ProductDTO> findAllByOrderByNameAsc();

    @Query("SELECT p FROM Product p WHERE p.supplier.supplierId = :supplierId")
    List<ProductDTO> findBySupplierId(int supplierId);


}
