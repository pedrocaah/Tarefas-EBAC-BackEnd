package templatemethod;

public class Policial extends Trabalhador{
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como policial");
    }
}
