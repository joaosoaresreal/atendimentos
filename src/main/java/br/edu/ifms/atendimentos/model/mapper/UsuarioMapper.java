package br.edu.ifms.atendimentos.model.mapper;

import br.edu.ifms.atendimentos.model.dto.UsuarioDto;
import br.edu.ifms.atendimentos.model.entities.Usuario;

public class UsuarioMapper {

	public static Usuario dtoToEntity(UsuarioDto usuarioDto) {
		Usuario usuario = new Usuario();
		usuario.setNome(usuarioDto.getNome());
		usuario.setCpf(usuarioDto.getCpf());
		usuario.setSenha(usuarioDto.getSenha());
		usuario.setEndereco(usuarioDto.getEndereco());
		usuario.setEmail(usuarioDto.getEmail());
		usuario.setTelefone(usuarioDto.getTelefone());
		return usuario;
	}

	public static UsuarioDto entityToDto(Usuario usuario) {
		UsuarioDto usuarioDto = new UsuarioDto();
		usuarioDto.setNome(usuario.getNome());
		usuarioDto.setCpf(usuario.getCpf());
		usuarioDto.setSenha(usuarioDto.getSenha());
		usuarioDto.setEndereco(usuarioDto.getEndereco());
		usuarioDto.setEmail(usuarioDto.getEmail());
		usuarioDto.setTelefone(usuarioDto.getTelefone());
		return usuarioDto;
	}

}
