package br.edu.ifms.atendimentos.atendimento;

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
@RequestMapping("/api/atendimento")
public class AtendimentoController {
    @Autowired // faz o Spring criar uma instância de AtendimentoService
    private AtendimentoService service;
    
    @GetMapping
    public ResponseEntity<List<AtendimentoDto>> listar() {
        List<Atendimento> listaEntity = service.listar();
        List<AtendimentoDto> listaDto = AtendimentoMapper.INSTANCE.map(listaEntity);
        return ResponseEntity.ok(listaDto);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<AtendimentoDto> cadastrar(
            @RequestBody @Valid AtendimentoForm form) {
        Atendimento entity = AtendimentoMapper.INSTANCE.toEntity(form);
        service.salvar(entity);
        AtendimentoDto dto = AtendimentoMapper.INSTANCE.toDto(entity);
        return ResponseEntity.accepted().body(dto);
    }
    
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<AtendimentoDto> atualizar(
            @PathVariable Long id,
            @RequestBody @Valid AtendimentoForm form) {
        Atendimento entity = service.atualizar(id, form);
        AtendimentoDto dto = AtendimentoMapper.INSTANCE.toDto(entity);
        return ResponseEntity.ok(dto);
    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }
}
