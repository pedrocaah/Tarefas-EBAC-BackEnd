package ifelse;

import java.util.Scanner;

public class ExemploPPTConsole {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int result = s.nextInt();

        if (result == 1) {
            System.out.println("Resultado igual a 1");
        }  else if ( result > 1) {
            System.out.println("Resultado maior que 1");
        } else {
            System.out.println("Resultado menor que 1");
        }
    }
}
