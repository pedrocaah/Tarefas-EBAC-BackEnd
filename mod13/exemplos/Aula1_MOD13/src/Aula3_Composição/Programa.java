package Aula3_Composição;

public class Programa {

    public static void main(String args[]) {
        Banco banco = new Banco();

        banco.setCodigo(10);
        banco.setNome("Banco Oliveira");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(10d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(10d);

        banco.add(cc);
        banco.add(cp);

        Banco banco2 = new Banco();
        banco.setCodigo(10L);
        banco.setNome("Banco Tavares");
    }
}
