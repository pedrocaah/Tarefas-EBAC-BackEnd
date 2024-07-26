public class Main {
    public static void main(String[] args) {

        int mediaPrimeiroBimestre = 8;
        int mediaSegundoBimestre = 6;
        int mediaTerceiroBimestre = 7;
        int mediaQuartoBimestre = 4;
        int somaMedias = mediaPrimeiroBimestre + mediaSegundoBimestre + mediaTerceiroBimestre + mediaQuartoBimestre;
        int mediaFinal = somaMedias / 4;

        System.out.println(mediaPrimeiroBimestre);
        System.out.println(mediaSegundoBimestre);
        System.out.println(mediaTerceiroBimestre);
        System.out.println(mediaQuartoBimestre);
        System.out.println(mediaFinal);

        if (mediaFinal >= 5){
            System.out.println("Aprovado");
        }
        if (mediaFinal < 5){
            System.out.println("Reprovado");
        }

    }
}