package br.edu.ifms.atendimentos.usuario;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsuarioMapper {
public static final UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);
    
    public UsuarioDto toDto(Usuario entity);
    
    public List<UsuarioDto> map(List<Usuario> items);

    @Mapping(target = "id", ignore = true)
    public void update(UsuarioForm dto, @MappingTarget Usuario entity);

    @Mapping(target = "id", ignore = true)
    public Usuario toEntity(UsuarioForm form);
}
