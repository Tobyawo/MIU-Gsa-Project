package com.miu.gsa.project.service;

import com.miu.gsa.project.entity.dto.ProductDTO;
import com.miu.gsa.project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;



    public List<ProductDTO> getAllProducts() {
        return productRepository.findAllByOrderByNameAsc();
    }

    public ProductDTO getProductById(Long productId) {
        Optional<ProductDTO> productOptional = productRepository.findByProductId(productId);
        return productOptional.orElse(null);
    }

    public List<ProductDTO> getProductsBySupplierId(int supplierId) {
        return productRepository.findBySupplierId(supplierId);

    }

}
