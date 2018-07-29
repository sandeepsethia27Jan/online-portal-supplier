package com.nanaesh.supplier.supplierpersistence.storage.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@EqualsAndHashCode
@Table(name = "supplieraddress")
@Entity
public class SupplierAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(max = 255, min = 255)
    @Column(name = "unitNo")
    private String unitNo;

    @Size(max = 255, min = 255)
    @Column(name = "blockNumber")
    private String blockNumber;

    @Size(max = 255, min = 255)
    @Column(name = "streetName")
    private String streetName;

    @Size(max = 255, min = 255)
    @Column(name = "district")
    private String district;

    @Size(max = 255, min = 255)
    @Column(name = "state")
    private String state;

    @Size(max = 9, min = 6)
    @Column(name = "postalCode")
    private String postalCode;

    @OneToOne
    private Supplier supplier;
}
