package br.edu.ifms.atendimentos.atendimento;

import br.edu.ifms.atendimentos.empresa.EmpresaDto;
import br.edu.ifms.atendimentos.servico.ServicoDto;
import br.edu.ifms.atendimentos.usuario.UsuarioDto;
import java.time.LocalDateTime;
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
    
    private int prioridade;
    private String descricao;
    private LocalDateTime emissao;
    private EmpresaDto empresa;
    private UsuarioDto usuario;
    private ServicoDto servico;
}
