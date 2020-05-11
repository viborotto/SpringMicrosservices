package br.com.mastertech.portaservice.mapper;

import br.com.mastertech.portaservice.dto.PortaDTO;
import br.com.mastertech.portaservice.model.Porta;
import org.springframework.stereotype.Component;

@Component
public class PortaMapper {

    public Porta convertFromDtoToEntity (PortaDTO dto) {
        Porta entity = new Porta();

        entity.setAndar(dto.getAndar());
        entity.setSala(dto.getSala());

        return entity;
    }

    public PortaDTO convertFromEntityToDto(Porta entity){
        PortaDTO dto = new PortaDTO();

        dto.setId(entity.getId());
        dto.setAndar(entity.getAndar());
        dto.setSala(entity.getSala());

        return dto;
    }
}
