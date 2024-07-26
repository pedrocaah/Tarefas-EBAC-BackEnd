import java.util.Scanner;

public class Mod9 {
    public static void main(String[] args) {

        System.out.println("Olá Tutores!");

        System.out.println("Tarefa conversão primitivo para wrapper\n");

        Scanner sc = new Scanner(System.in);
        long cel = sc.nextLong();

        Long cell = cel;
        System.out.println("wrapper " + cell + "\n");

        ///////////////////////////////////

        System.out.println("Tarefa casting\n");

        int num = 123456789;

        //casting explicito
        System.out.println("valor para casting em int " + num);

        short num1 = (short) num;
        System.out.println("casting explicito em int p/ short " + num1);

        //casting implicito
        long num2 = num;
        System.out.println("casting implicito em int p/ long " + num2);
    }
}