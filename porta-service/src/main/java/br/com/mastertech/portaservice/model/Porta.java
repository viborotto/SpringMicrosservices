package br.com.mastertech.portaservice.model;

import javax.persistence.*;

@Entity
@Table(name = "porta")
public class Porta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String andar;

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
