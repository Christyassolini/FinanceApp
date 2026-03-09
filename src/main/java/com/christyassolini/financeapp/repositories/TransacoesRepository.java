package com.christyassolini.financeapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christyassolini.financeapp.model.Transacoes;

public interface TransacoesRepository extends JpaRepository<Transacoes, Long> {
    
}
