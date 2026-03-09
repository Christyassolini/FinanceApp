package com.christyassolini.financeapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christyassolini.financeapp.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
