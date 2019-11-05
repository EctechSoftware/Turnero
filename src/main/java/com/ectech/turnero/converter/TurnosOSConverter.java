package com.ectech.turnero.converter;

import com.ectech.turnero.dto.TurnosOSDTO;
import com.ectech.turnero.entities.TurnosOSEntity;

public class TurnosOSConverter {

    public TurnosOSDTO entityToDTO(TurnosOSEntity entity) {
        TurnosOSDTO dto = new TurnosOSDTO();
        dto.id = entity.getId();
        dto.hora = entity.getHora();
        dto.fecha = entity.getFecha();
        
        return dto;
    }
    
    public TurnosOSEntity dtoToEntity(TurnosOSDTO dto) {
        TurnosOSEntity entity = new TurnosOSEntity();
        entity.setFecha(dto.fecha);
        entity.setHora(dto.hora);
        
        return entity;
    }
}
