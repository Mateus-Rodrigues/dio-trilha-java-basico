import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite se nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Ola me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " Anos");
        System.out.println("Minha altura é " + altura + " cm");
       
    }
}
