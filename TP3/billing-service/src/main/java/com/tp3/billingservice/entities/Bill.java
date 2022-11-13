package com.tp3.billingservice.entities;

import com.tp3.billingservice.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date billingDate;

    @OneToMany
    private Collection<ProductItem> productItems;

    private Long customerID;

    @Transient
    private Customer customer;

}
