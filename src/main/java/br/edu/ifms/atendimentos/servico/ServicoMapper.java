package br.edu.ifms.atendimentos.servico;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ServicoMapper {
    public static final ServicoMapper INSTANCE = Mappers.getMapper(ServicoMapper.class);
    
    public ServicoDto toDto(Servico entity);
    
    public List<ServicoDto> map(List<Servico> items);

    @Mapping(target = "id", ignore = true)
    public void update(ServicoForm dto, @MappingTarget Servico entity);

    @Mapping(target = "id", ignore = true)
    public Servico toEntity(ServicoForm form);
}
