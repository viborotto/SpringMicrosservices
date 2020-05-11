package br.com.mastertech.cartao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Serviço de cliente indisponível")
public class ClienteOfflineException extends RuntimeException {

}
