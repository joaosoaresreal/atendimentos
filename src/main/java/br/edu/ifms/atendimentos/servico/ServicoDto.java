package br.edu.ifms.atendimentos.servico;

import br.edu.ifms.atendimentos.empresa.EmpresaDto;
import br.edu.ifms.atendimentos.usuario.UsuarioDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class ServicoDto {

    private String prioridade;
    private EmpresaDto empresaDto;
    private UsuarioDto usuarioDto;
}
