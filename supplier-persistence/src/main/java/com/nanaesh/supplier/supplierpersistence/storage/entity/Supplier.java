package com.nanaesh.supplier.supplierpersistence.storage.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table(name = "supplier", uniqueConstraints = @UniqueConstraint(columnNames = {"firmName", "GSTN"}))
@Setter
@Getter
@EqualsAndHashCode
@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;

    @NotNull(message = "supplier firstName can not be null.")
    @Column(name = "firstName")
    @Size(max = 255, min = 3)
    private String firstName;

    @Size(max = 255, min = 3)
    @Column(name = "lastName")
    private String lastName;

    @NotNull(message = "Supplier without a valid firmName is not allowed.")
    @Size(max = 255, min = 3)
    @Column(name = "firmName")
    private String firmName;

    @Size(max = 20, min = 16)
    @Column(name = "GSTN")
    private String gstn;

    @OneToOne
    private SupplierAddress address;

}
