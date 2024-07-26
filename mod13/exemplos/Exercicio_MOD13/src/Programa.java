public class Programa {

    public static void main(String[] args) {

    PessoaFisica pessoaFisica = new PessoaFisica();
    pessoaFisica.setNome("Pedro");
    pessoaFisica.setSobrenome("Oliveira");
    pessoaFisica.setRG(1L);
    pessoaFisica.setCpf(11L);
    System.out.println("Nome - " + pessoaFisica.getNome() + ", Sobrenome - " + pessoaFisica.getSobrenome() +
            ", RG: " + pessoaFisica.getRG() + ", Cadastrado no CPF: " + pessoaFisica.getCpf());

    PessoaJuridica pessoaJuridica = new PessoaJuridica();
    pessoaJuridica.setNome("Henrique");
    pessoaJuridica.setSobrenome("Tavares");
    pessoaJuridica.setRG( 12L );
    pessoaJuridica.setCnpj( 123L );
        System.out.println("Nome - " + pessoaJuridica.getNome() + ", Sobrenome - " + pessoaJuridica.getSobrenome() +
                ", RG: " + pessoaJuridica.getRG() + ", Cadastrado no CPF: " + pessoaJuridica.getCnpj());
    }

}