package br.edu.ifms.atendimentos.servico;

import br.edu.ifms.atendimentos.atendimento.AtendimentoDto;
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

    private String nome;
    
    private AtendimentoDto atendimento;
}
