package com.mapping.repository;

import com.mapping.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
    // You can add custom query methods if needed
}