package com.example.bankapp.repository;

import com.example.bankapp.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
        List<Transaction> findByAccountId(Long accountId);
    }
