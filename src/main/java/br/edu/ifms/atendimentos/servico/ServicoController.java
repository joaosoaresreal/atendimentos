package br.edu.ifms.atendimentos.servico;

import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/servico")
public class ServicoController {
    @Autowired // faz o Spring criar uma instância de ServicoService
    private ServicoService service;
    
    @GetMapping
    public ResponseEntity<List<ServicoDto>> listar() {
        List<Servico> listaEntity = service.listar();
        List<ServicoDto> listaDto = ServicoMapper.INSTANCE.map(listaEntity);
        return ResponseEntity.ok(listaDto);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<ServicoDto> cadastrar(
            @RequestBody @Valid ServicoForm form) {
        Servico entity = ServicoMapper.INSTANCE.toEntity(form);
        service.salvar(entity);
        ServicoDto dto = ServicoMapper.INSTANCE.toDto(entity);
        return ResponseEntity.accepted().body(dto);
    }
    
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<ServicoDto> atualizar(
            @PathVariable Long id,
            @RequestBody @Valid ServicoForm form) {
        Servico entity = service.atualizar(id, form);
        ServicoDto dto = ServicoMapper.INSTANCE.toDto(entity);
        return ResponseEntity.ok(dto);
    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }
}
