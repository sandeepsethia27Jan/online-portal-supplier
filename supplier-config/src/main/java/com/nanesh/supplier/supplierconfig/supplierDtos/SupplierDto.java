package com.nanesh.supplier.supplierconfig.supplierDtos;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SupplierDto {
    private String supplierName;
    private String firmName;
    private String gstn;
    private String address;
}
