package br.edu.ifms.atendimentos.atendimento;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Usuario não encontrada")

public class AtendimentoNotFoundException extends ResponseStatusException {

      public AtendimentoNotFoundException(String errorMessage){
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
    
}