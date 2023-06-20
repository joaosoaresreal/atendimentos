package br.edu.ifms.atendimentos.servico;

import br.edu.ifms.atendimentos.empresa.EmpresaDto;
import br.edu.ifms.atendimentos.usuario.UsuarioDto;
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
public class ServicoForm {

    private String prioridade;
    private EmpresaDto empresaDto;
    private UsuarioDto usuarioDto;
}
