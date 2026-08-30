import java.util.Scanner;

public class atv17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Em maiúsculas: " + nomeCompleto.toUpperCase());
        System.out.println("Quantidade de caracteres: " + nomeCompleto.length());

        sc.close();
    }
}
