package br.edu.ifms.atendimentos.servico;

import br.edu.ifms.atendimentos.atendimento.AtendimentoDto;
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

    private String nome;
    private AtendimentoDto atendimento;
}
