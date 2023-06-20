package br.edu.ifms.atendimentos.usuario;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	@Autowired
    private UsuarioRepository repository;
    
    public List<Usuario> listar() {
        return repository.findAll();
    }
    
    public Usuario salvar(Usuario entity) {
        Usuario p = repository.save(entity);
        return p;
    }
    
    public Usuario atualizar(Long id, UsuarioForm form) {
        Usuario entity = buscarPorId(id);
        UsuarioMapper.INSTANCE.update(form, entity);
        return entity;
    }
    
    public Usuario buscarPorId(Long id) {
        Optional<Usuario> optional = repository.findById(id);
        if (optional.isEmpty()) {
            String msg = "Não existe Usuario para o código [%d] informado";
            throw new UsuarioNotFoundException(String.format(msg, id));
        }
        return optional.get();
    }

    public void excluir(Long id) {
        Usuario entity = buscarPorId(id);
        repository.delete(entity);
    }
}
