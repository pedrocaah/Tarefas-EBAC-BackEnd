import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Tabela(nome = "", sobrenome = "", idade = 0)
public class App {
    public static void main(String args[]) {
        Class clazz = ValoresTabela.class;
        System.out.println(clazz);

            ValoresTabela valoresTabela = new ValoresTabela();

            Field[] fields = valoresTabela.getClass().getDeclaredFields();
            for (Field field : fields){
                Tabela annotation = field.getAnnotation(Tabela.class);
                System.out.println(annotation.nome());
                System.out.println(annotation.sobrenome());
                System.out.println(annotation.idade());
            }

            Method[] Method = valoresTabela.getClass().getDeclaredMethods();
            for (Method m : Method) {
                Class<Tabela> type = (Class<Tabela>) m.getReturnType();
                String nome = m.getName();
                System.out.println();
                System.out.println(nome);
            }
        }
    }

