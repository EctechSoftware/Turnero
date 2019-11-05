package com.ectech.turnero.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ectech.turnero.entities.TurnosOSEntity;

@Repository
public interface TurnosOSRepository extends JpaRepository<TurnosOSEntity, Integer>{

}
