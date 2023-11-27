package com.example.finalFS.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finalFS.persistence.entities.LibroEntity;


@Repository
public interface LibroRepository extends JpaRepository<LibroEntity, Long> {
}