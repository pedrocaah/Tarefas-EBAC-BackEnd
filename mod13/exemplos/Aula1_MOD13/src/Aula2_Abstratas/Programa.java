package Aula2_Abstratas;

public class Programa {

    public static void main(String args[]){
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Pedro");
        empregado.setSobrenome("Oliveira");
        empregado.setSalario(100d);
        imprimir(empregado);
        //System.out.println(empregado.getNome() + " tem salário de: " + empregado.vencimento() + "Reais");

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Pedro2");
        comissionado.setSobrenome("Oliveira2");
        comissionado.setTotalVenda(1000d);
        comissionado.setTotalComissao(01d);
        imprimir(comissionado);
        //System.out.println(comissionado.getNome() + " tem comissão de: " + comissionado.vencimento() + "Reais");


        Horista horista = new Horista();
        horista.setCpf("3");
        horista.setNome("Pedro23");
        horista.setSobrenome("Oliveira23");
        horista.setPrecoHora(100d);
        horista.setTotalHoraTrabalhada(60d);
        imprimir(horista);

        //System.out.println(horista.getNome() + " tem salário de: " + horista.vencimento() + "Reais");

    }

    public static void imprimir(Empregado empregado){
        if (empregado instanceof  Horista) {
            Horista hor = (Horista) empregado;
            System.out.println(hor.getPrecoHora());
        }
        empregado.imprimirSobrenome();
        empregado.imprimirValores();
        System.out.println(empregado.getNome() + " tem salário de: " + empregado.vencimento() + "Reais");

    }
}
