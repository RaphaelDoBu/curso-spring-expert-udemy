package com.estudo.domain.repository;

import com.estudo.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
