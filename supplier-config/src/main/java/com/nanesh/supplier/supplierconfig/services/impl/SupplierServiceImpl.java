package com.nanesh.supplier.supplierconfig.services.impl;

import com.nanaesh.supplier.supplierpersistence.storage.repository.SupplierRepository;
import com.nanesh.supplier.supplierconfig.services.SupplierService;
import com.nanesh.supplier.supplierconfig.supplierDtos.SupplierDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierRepository supplierRepository;


    @Override
    public List<SupplierDto> getSupplierList() {
        return supplierRepository.findAll().stream()
                .map(x -> SupplierDto.builder()
                        .supplierName(x.getFirmName() + " " + x.getLastName())
                        .firmName(x.getFirmName())
                        .gstn(x.getGstn())
                        .build())
                .collect(Collectors.toList());
    }
}
