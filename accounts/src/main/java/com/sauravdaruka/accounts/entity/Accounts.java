package com.sauravdaruka.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
// @Data is not used as hashcode(), equals() is not required for entity class and may cause issue with Spring Data JPA framework
public class Accounts extends BaseEntity{

    private Long customerId;
    @Id
    // To generate primary key, logic is written in code and is not generated automatically in DB as it is a security risk
    // Bank account no should not be sequential and it will be 10-digit no
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}
