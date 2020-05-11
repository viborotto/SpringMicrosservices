package br.com.mastertech.portaservice.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PortaDTO {

    private Long id;

    @NotNull(message = "Andar da porta não pode ser nulo")
    @NotBlank(message = "Favor informar o andar da porta")
    private String andar;

    @NotNull(message = "Sala da porta não pode ser nulo")
    @NotBlank(message = "Favor informar a sala da porta")
    private String sala;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
