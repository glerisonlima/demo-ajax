package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.domain.Promocao;

@Repository
public interface PromocaoRepository extends JpaRepository<Promocao, Long>{

}
