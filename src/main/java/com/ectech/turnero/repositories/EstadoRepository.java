package com.ectech.turnero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ectech.turnero.entities.EstadosEntity;

@Repository
public interface EstadoRepository extends JpaRepository<EstadosEntity, Integer>{

}
