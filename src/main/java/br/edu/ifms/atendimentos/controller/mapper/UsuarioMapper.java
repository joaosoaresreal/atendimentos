package br.edu.ifms.atendimentos.controller.mapper;

import br.edu.ifms.atendimentos.controller.dto.UsuarioRequest;
import br.edu.ifms.atendimentos.controller.dto.UsuarioResponse;
import br.edu.ifms.atendimentos.model.dto.UsuarioDto;

public class UsuarioMapper {

	public static UsuarioDto requestToDto(UsuarioRequest usuarioRequest) {
		UsuarioDto usuarioDto = new UsuarioDto();
		usuarioDto.setNome(usuarioRequest.getNome());
		usuarioDto.setCpf(usuarioRequest.getCpf());
		usuarioDto.setSenha(usuarioRequest.getSenha());
		usuarioDto.setEndereco(usuarioRequest.getEndereco());
		usuarioDto.setEmail(usuarioRequest.getEmail());
		usuarioDto.setTelefone(usuarioRequest.getTelefone());
		return usuarioDto;
	}

	public static UsuarioResponse dtoToResponse(UsuarioDto usuarioDto) {
		UsuarioResponse usuarioResponse = new UsuarioResponse();
		usuarioResponse.setNome(usuarioDto.getNome());
		usuarioResponse.setCpf(usuarioDto.getCpf());
		usuarioResponse.setSenha(usuarioDto.getSenha());
		usuarioResponse.setEndereco(usuarioDto.getEndereco());
		usuarioResponse.setEmail(usuarioDto.getEmail());
		usuarioResponse.setTelefone(usuarioDto.getTelefone());
		return usuarioResponse;
	}

}
