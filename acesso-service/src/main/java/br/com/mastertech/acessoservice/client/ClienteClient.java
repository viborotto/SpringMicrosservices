package br.com.mastertech.acessoservice.client;

import br.com.mastertech.acessoservice.dto.PortaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cliente-service")
public interface ClienteClient {

    @GetMapping("/porta/{id}")
    PortaDTO obterPortaPorId(@PathVariable Long id);

}