package com.ectech.turnero.converter;

import com.ectech.turnero.dto.EstadoDTO;
import com.ectech.turnero.entities.EstadosEntity;

public class EstadoConverter {

    public EstadoDTO entityToDTO(EstadosEntity entity) {
        EstadoDTO dto = new EstadoDTO();
        dto.id = entity.getId();
        dto.estado = entity.getEstado();
        
        return dto;
    }
    
    public EstadosEntity dtoToEntity(EstadoDTO dto) {
        EstadosEntity entity = new EstadosEntity();
        entity.setEstado(dto.estado);
        
        return entity;
    }
}
