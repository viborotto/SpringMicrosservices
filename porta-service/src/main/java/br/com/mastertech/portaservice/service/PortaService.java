package br.com.mastertech.portaservice.service;

import br.com.mastertech.portaservice.exception.PortaNaoEncontradaException;
import br.com.mastertech.portaservice.model.Porta;
import br.com.mastertech.portaservice.repository.PortaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PortaService {

    private PortaRepository repository;

    public PortaService(PortaRepository repository){
        this.repository = repository;
    }

    public Porta criar(Porta porta){
        return repository.save(porta);
    }


    public Porta obterPortaPorId(Long id) throws PortaNaoEncontradaException {
        Optional<Porta> portaOptional = repository.findById(id);

        if (!portaOptional.isPresent()) {
            throw new PortaNaoEncontradaException("Porta não encontrada");
        }

        return portaOptional.get();
    }


}
