package br.edu.ifms.atendimentos.usuario;

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
@RequestMapping("/api/usuario")
public class UsuarioController {
	@Autowired // faz o Spring criar uma instância de UsuarioService
    private UsuarioService service;
    
    @GetMapping
    public ResponseEntity<List<UsuarioDto>> listar() {
        List<Usuario> listaEntity = service.listar();
        List<UsuarioDto> listaDto = UsuarioMapper.INSTANCE.map(listaEntity);
        return ResponseEntity.ok(listaDto);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<UsuarioDto> cadastrar(
            @RequestBody @Valid UsuarioForm form) {
        Usuario entity = UsuarioMapper.INSTANCE.toEntity(form);
        service.salvar(entity);
        UsuarioDto dto = UsuarioMapper.INSTANCE.toDto(entity);
        return ResponseEntity.accepted().body(dto);
    }
    
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<UsuarioDto> atualizar(
            @PathVariable Long id,
            @RequestBody @Valid UsuarioForm form) {
        Usuario entity = service.atualizar(id, form);
        UsuarioDto dto = UsuarioMapper.INSTANCE.toDto(entity);
        return ResponseEntity.ok(dto);
    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }
}
