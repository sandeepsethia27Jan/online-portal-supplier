package com.nanaesh.supplier.supplierpersistence.storage.repository;

import com.nanaesh.supplier.supplierpersistence.storage.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional(readOnly = true)
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
