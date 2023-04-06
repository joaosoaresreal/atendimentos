package br.edu.ifms.atendimentos.model.services;

import org.springframework.stereotype.Service;

import br.edu.ifms.atendimentos.model.dto.UsuarioDto;
import br.edu.ifms.atendimentos.model.entities.Usuario;
import br.edu.ifms.atendimentos.model.mapper.UsuarioMapper;
import br.edu.ifms.atendimentos.model.repositories.UsuarioRepository;
import br.edu.ifms.atendimentos.utils.MD5;

@Service
public class UsuarioService {

	private final UsuarioRepository repository;

	public UsuarioService(UsuarioRepository repository) {
		this.repository = repository;
	}

	public UsuarioDto create(UsuarioDto usuarioDto) {
		usuarioDto.setNome(usuarioDto.getNome().toUpperCase());
		usuarioDto.setEmail(usuarioDto.getEmail().toLowerCase());
		usuarioDto.setSenha(MD5.encode(usuarioDto.getSenha()));

		Usuario usuario = UsuarioMapper.dtoToEntity(usuarioDto);
		repository.save(usuario);

		return UsuarioMapper.entityToDto(usuario);
	}

}
