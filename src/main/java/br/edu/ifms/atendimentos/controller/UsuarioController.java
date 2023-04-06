package br.edu.ifms.atendimentos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.atendimentos.controller.dto.UsuarioRequest;
import br.edu.ifms.atendimentos.controller.dto.UsuarioResponse;
import br.edu.ifms.atendimentos.controller.mapper.UsuarioMapper;
import br.edu.ifms.atendimentos.model.dto.UsuarioDto;
import br.edu.ifms.atendimentos.model.services.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/usuario")
@Tag(name = "Usuarios", description = "Criação de Usuários")
public class UsuarioController {

	private final UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@Operation(summary = "Novo recurso", description = "Serviço para cadastrar um usuario")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Operação de sucesso", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UsuarioResponse.class))),
			@ApiResponse(responseCode = "500", description = "Falha no serviço", content = @Content)
	})

	@PostMapping
	public ResponseEntity<UsuarioResponse> create(@RequestBody UsuarioRequest usuarioRequest) {

		UsuarioDto usuarioDto = UsuarioMapper.requestToDto(usuarioRequest);
		UsuarioDto usuarioDto2 = usuarioService.create(usuarioDto);

		UsuarioResponse usuarioResponse = UsuarioMapper.dtoToResponse(usuarioDto2);
		return ResponseEntity.ok(usuarioResponse);
	}
}
