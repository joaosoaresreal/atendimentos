package br.edu.ifms.atendimentos.atendimento;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtendimentoService {
    @Autowired
    private AtendimentoRepository repository;

    public List<Atendimento> listar() {
        return repository.findAll();
    }

    public Atendimento salvar(Atendimento entity) {
        Atendimento p = repository.save(entity);
        return p;
    }

    public Atendimento atualizar(Long id, AtendimentoForm form) {
        Atendimento entity = buscarPorId(id);
        AtendimentoMapper.INSTANCE.update(form, entity);
        return entity;
    }

    public Atendimento buscarPorId(Long id) {
        Optional<Atendimento> optional = repository.findById(id);
        if (optional.isEmpty()) {
            String msg = "Não existe Atendimento para o código [%d] informado";
            throw new AtendimentoNotFoundException(String.format(msg, id));
        }
        return optional.get();
    }

    public void excluir(Long id) {
        Atendimento entity = buscarPorId(id);
        repository.delete(entity);
    }
}
