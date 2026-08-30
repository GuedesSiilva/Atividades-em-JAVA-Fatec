import java.util.Scanner;

public class atv16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // limpa o buffer do Enter

        System.out.print("Digite seu curso: ");
        String curso = sc.nextLine();

        System.out.println("===== FICHA DO ALUNO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("===========================");

        sc.close();
    }
}
