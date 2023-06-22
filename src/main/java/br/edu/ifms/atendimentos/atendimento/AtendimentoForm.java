package br.edu.ifms.atendimentos.atendimento;

import br.edu.ifms.atendimentos.empresa.EmpresaDto;
import br.edu.ifms.atendimentos.usuario.UsuarioDto;
import java.time.LocalDateTime;
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
public class AtendimentoForm {
    
    private int prioridade;
    private LocalDateTime emissao;
    private EmpresaDto empresa;
    private UsuarioDto usuario;
}
