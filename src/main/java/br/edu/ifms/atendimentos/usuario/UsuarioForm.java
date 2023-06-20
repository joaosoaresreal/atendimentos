package br.edu.ifms.atendimentos.usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UsuarioForm {
	private String nome;
	private String senha;
	private String endereco;
	private String email;
	private String telefone;
}
