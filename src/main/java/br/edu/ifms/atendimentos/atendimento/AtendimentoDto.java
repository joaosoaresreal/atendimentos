package br.edu.ifms.atendimentos.atendimento;

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
public class AtendimentoDto {

    private EmpresaDto empresaDto;
    private UsuarioDto usuarioDto;
}
