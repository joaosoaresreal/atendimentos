package br.edu.ifms.atendimentos.empresa;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Usuario não encontrada")

public class EmpresaNotFoundException extends ResponseStatusException {

      public EmpresaNotFoundException(String errorMessage){
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
    
}