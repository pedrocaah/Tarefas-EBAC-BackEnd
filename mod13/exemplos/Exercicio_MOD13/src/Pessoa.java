public abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private Long RG;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Long getRG() {
        return RG;
    }

    public void setRG(Long RG) {
        this.RG = RG;
    }
}
