package com.sauravdaruka.accounts.repository;

import com.sauravdaruka.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional
    @Modifying // tells JPA framework that this query will be modifying the data so execute the query of this method inside a transaction
    void deleteByCustomerId(Long customerId);
}
