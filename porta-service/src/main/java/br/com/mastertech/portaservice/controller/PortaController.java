package br.com.mastertech.portaservice.controller;

import br.com.mastertech.portaservice.dto.PortaDTO;
import br.com.mastertech.portaservice.exception.PortaNaoEncontradaException;
import br.com.mastertech.portaservice.mapper.PortaMapper;
import br.com.mastertech.portaservice.model.Porta;
import br.com.mastertech.portaservice.service.PortaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/porta")
public class PortaController {

    private PortaMapper portaMapper;
    private PortaService service;

    public PortaController (PortaService service, PortaMapper portaMapper){
        this.service = service;
        this.portaMapper = portaMapper;
    }

    @PostMapping
    public ResponseEntity<PortaDTO> criarPorta(@Valid @RequestBody PortaDTO portaDTO){
        Porta entity = portaMapper.convertFromDtoToEntity(portaDTO);

        entity = service.criar(entity);

        return ResponseEntity.status(HttpStatus.CREATED).body(portaMapper.convertFromEntityToDto(entity));
    }

    //get por id
    @GetMapping("/{id}")
    public ResponseEntity<PortaDTO> obterPortaPorId(@PathVariable Long id) throws PortaNaoEncontradaException {
        Porta entity = service.obterPortaPorId(id);

        return ResponseEntity.ok(portaMapper.convertFromEntityToDto(entity));
    }

}
