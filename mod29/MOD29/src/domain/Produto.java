package domain;

public class Produto {

    private Long id;
    private Double valor;
    private String codigo;
    private String nome;

    public Produto() {
    }

    public Produto(Long id, String codigo, String nome, Double valor) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
