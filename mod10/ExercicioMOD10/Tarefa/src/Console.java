import java.util.Scanner;

public class Console {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a nota do primeiro bimestre: ");
        int primeiro_bimestre = s.nextInt();

        System.out.println("Digite a nota do segundo bimestre: ");
        int segundo_bimestre  = s.nextInt();

        System.out.println("Digite a nota do terceiro bimestre: ");
        int terceiro_bimestre = s.nextInt();

        System.out.println("Digite a nota do quarto bimestre: ");
        int quarto_bimestre = s.nextInt();

        Integer soma = Integer.valueOf(primeiro_bimestre + segundo_bimestre + terceiro_bimestre + quarto_bimestre);
        int media = (soma / 4);
        String mediaSt = getMedia(media);
        System.out.println("Media final = " +mediaSt);
    }

    public static String getMedia(int media){
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
