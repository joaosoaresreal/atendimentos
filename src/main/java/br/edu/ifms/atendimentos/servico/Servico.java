package br.edu.ifms.atendimentos.servico;

import br.edu.ifms.atendimentos.empresa.Empresa;
import br.edu.ifms.atendimentos.usuario.Usuario;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

@Entity // Cria uma tabela no SGBD com o mesmo nome da classe
@Data // Implementa os métodos GET e SET para cada atributo
@EqualsAndHashCode // Cria os métodos equals e hashCode que é utilizado para comparação
@AllArgsConstructor // cria construtores com todos os atributos
@NoArgsConstructor // cria construtor sem parâmetros
@Builder // padrão de projeto para construção de objetos
public class Servico {

    @ManyToAny
    private Empresa empresa;
    @ManyToAny
    private Usuario usuario;
    private String prioridade;
}
