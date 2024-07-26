package br.com.pedrooliveira.domain;

import br.com.pedrooliveira.dao.jpa.Persistente;
import lombok.Data;

import javax.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUTO")
@Data
public class Produto implements Persistente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
    @SequenceGenerator(name = "prod_seq", sequenceName = "sq_produto", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "codigo", nullable = false, length = 10, unique = true)
    private String codigo;

    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @Column(name = "DESCRICAO", nullable = false, length = 50)
    private String descricao;

    @Column(name = "valor", nullable = false)
    private BigDecimal valor;
}
