package com.miu.gsa.project.entity.dto;

import com.miu.gsa.project.entity.dto.SupplierDTO;
import lombok.Data;

import java.time.LocalDateTime;

public interface ProductDTO {


    Long getProductId();
    String getName();
    double getUnitPrice();
    int getQuantityInStock();
    LocalDateTime getDateSupplied();
    SupplierDTO getSupplier();

}
