package br.edu.ifms.atendimentos.servico;

import br.edu.ifms.atendimentos.atendimento.Atendimento;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity // Cria uma tabela no SGBD com o mesmo nome da classe
@Data // Implementa os métodos GET e SET para cada atributo
@EqualsAndHashCode // Cria os métodos equals e hashCode que é utilizado para comparação
@AllArgsConstructor // cria construtores com todos os atributos
@NoArgsConstructor // cria construtor sem parâmetros
@Builder // padrão de projeto para construção de objetos
public class Servico {

    @Id
    @GeneratedValue(generator = "servico_seq")
    private Long id;
    private String nome;
    @ManyToOne
    @JoinColumn(name = "atendimento_id",
            insertable = false,
            updatable = false)
    private Atendimento atendimento;
   
}
