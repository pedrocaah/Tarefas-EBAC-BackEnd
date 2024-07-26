package br.com.pedrooliveira.domain;

import br.com.pedrooliveira.dao.jpa.Persistente;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Persistente {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_seq")
    @SequenceGenerator(name="cliente_seq", sequenceName="sq_cliente", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @Column(name = "CPF", nullable = false, unique = true)
    private Long cpf;

    @Column(name = "TEL", nullable = false)
    private Long tel;

    @Column(name = "ENDERECO", nullable = false, length = 100)
    private String end;

    @Column(name = "NUMERO", nullable = false)
    private Integer numero;

    @Column(name = "CIDADE", nullable = false, length = 100)
    private String cidade;

    @Column(name = "ESTADO", nullable = false, length = 50)
    private String estado;
}