public class ExercicioMOD10 {

    public static void main(String[] args) {
        int bimestre1 = 6;
        int bimestre2 = 4;
        int bimestre3 = 7;
        int bimestre4 = 4;
        int soma = (bimestre1 + bimestre2 + bimestre3 + bimestre4);
        int media = (soma / 4);
        System.out.print("media final = " + media);
    }

    public static String getmedia (int media){

        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
