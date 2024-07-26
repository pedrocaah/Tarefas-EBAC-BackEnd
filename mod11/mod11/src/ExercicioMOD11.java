import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ExercicioMOD11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome ou 'encerrar' para imprimir lista: ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("encerrar")) {
                break;
            }

            System.out.print("Digite o sexo M/F: ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                homens.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                mulheres.add(nome);
            } else {
                System.out.println("Use 'M' para masculino ou 'F' para feminino.");
            }
        }

        scanner.close();

        System.out.println("\nLista de Homens:");
        for (String homem : homens) {
            System.out.println(homem);
        }

        System.out.println("\nLista de Mulheres:");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }
    }
}
