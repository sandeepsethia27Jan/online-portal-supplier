package com.nanesh.supplier.supplierconfig.controllers;

import com.nanesh.supplier.supplierconfig.services.SupplierService;
import com.nanesh.supplier.supplierconfig.supplierDtos.SupplierDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    public List<SupplierDto> getCustomerList() {
        return new ArrayList<>();
    }
}
