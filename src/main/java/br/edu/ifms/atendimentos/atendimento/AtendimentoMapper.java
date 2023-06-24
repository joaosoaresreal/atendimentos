package br.edu.ifms.atendimentos.atendimento;

import br.edu.ifms.atendimentos.empresa.EmpresaMapper;
import br.edu.ifms.atendimentos.servico.ServicoMapper;
import br.edu.ifms.atendimentos.usuario.UsuarioMapper;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(
        uses = {EmpresaMapper.class, UsuarioMapper.class, ServicoMapper.class}
)
public interface AtendimentoMapper {
    public static final AtendimentoMapper INSTANCE = Mappers.getMapper(AtendimentoMapper.class);
    
    public AtendimentoDto toDto(Atendimento entity);
    
    public List<AtendimentoDto> map(List<Atendimento> items);

    @Mapping(target = "id", ignore = true)
    public void update(AtendimentoForm dto, @MappingTarget Atendimento entity);

    @Mapping(target = "id", ignore = true)
    public Atendimento toEntity(AtendimentoForm form);
}
