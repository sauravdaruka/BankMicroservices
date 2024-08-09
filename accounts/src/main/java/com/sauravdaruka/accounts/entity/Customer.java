package com.sauravdaruka.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Entity
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Long customerId;

    private String name;

    private String email;

    @Column(name="mobile_number")
    private String mobileNumber;
}
