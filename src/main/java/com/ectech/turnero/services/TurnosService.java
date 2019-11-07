package com.ectech.turnero.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ectech.turnero.converter.TurnosOSConverter;
import com.ectech.turnero.dto.TurnosOSDTO;
import com.ectech.turnero.entities.TurnosOSEntity;
import com.ectech.turnero.repositories.TurnosOSRepository;

@Service
public class TurnosService {

    @Autowired
    TurnosOSRepository turnosOSRepository;
    
    private TurnosOSConverter turnosOSConverter = new TurnosOSConverter();
    
    public ResponseEntity<?> getTurnosOS(){
        List<TurnosOSDTO> dtos = new ArrayList<TurnosOSDTO>();
        List<TurnosOSEntity> entities = turnosOSRepository.findAll();
        for(TurnosOSEntity entity : entities) {
            TurnosOSDTO dto = turnosOSConverter.entityToDTO(entity);
            dtos.add(dto);
        }
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }
}
