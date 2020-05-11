package br.com.mastertech.cliente.client;

import br.com.mastertech.cliente.dto.PortaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "porta-service")
public interface PortaClient {

    @GetMapping("/porta/{id}")
    PortaDTO obterPortaPorId(@PathVariable Long id);

}
