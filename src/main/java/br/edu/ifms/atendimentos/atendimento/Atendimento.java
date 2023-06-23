package br.edu.ifms.atendimentos.atendimento;

import br.edu.ifms.atendimentos.empresa.Empresa;
import br.edu.ifms.atendimentos.usuario.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
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
public class Atendimento {

    @Id
    @GeneratedValue(generator = "atendimento_seq")
    private Long id;
    private int prioridade;
    private LocalDateTime emissao;
    @ManyToOne
    @JoinColumn(name = "empresa_id",
            insertable = false,
            updatable = false)
    private Empresa empresa;
    @ManyToOne
    @JoinColumn(name = "usuario_id",
            insertable = false,
            updatable = false)
    private Usuario usuario;

}
