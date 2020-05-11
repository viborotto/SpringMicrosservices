package br.com.mastertech.portaservice.exception;

public class PortaNaoEncontradaException extends Exception {

    private String mensagem;

    public PortaNaoEncontradaException(String mensagem){
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return this.mensagem;
    }
}
