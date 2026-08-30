import java.util.Scanner;

public class atv18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();

        char inicialNome = nome.charAt(0);
        char inicialSobrenome = sobrenome.charAt(0);

        System.out.println("Iniciais: " + inicialNome + "." + inicialSobrenome + ".");

        sc.close();
    }
}
