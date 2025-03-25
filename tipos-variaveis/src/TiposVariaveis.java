public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String meuNome = "Mateus";
        String meuSobrenome = "Rodrigues";

        int ano_De_Nascimento = 1993;
        int ano_Atual = 2025;

        int idade = ano_Atual - ano_De_Nascimento;

        System.out.print("Olá " + meuNome + (" ") + meuSobrenome + " parabens pelos seus " + idade + " anos");
    }
}
