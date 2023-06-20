package br.edu.ifms.atendimentos.empresa;

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
public class EmpresaForm {

    private Integer id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String email;
}
