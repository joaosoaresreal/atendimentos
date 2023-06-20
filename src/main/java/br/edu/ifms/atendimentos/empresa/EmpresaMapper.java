package br.edu.ifms.atendimentos.empresa;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmpresaMapper {
    public static final EmpresaMapper INSTANCE = Mappers.getMapper(EmpresaMapper.class);
    
    public EmpresaDto toDto(Empresa entity);
    
    public List<EmpresaDto> map(List<Empresa> items);

    @Mapping(target = "id", ignore = true)
    public void update(EmpresaForm dto, @MappingTarget Empresa entity);

    @Mapping(target = "id", ignore = true)
    public Empresa toEntity(EmpresaForm form);
}
