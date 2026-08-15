import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual nome aparecerá na mensagem? ");
        String nome = scan.nextLine();
        System.out.println("Qual idade desta pessoa? ");
        String idade = scan.nextLine();
        System.out.println(nome + " possui " + idade + " anos.");
    }
}
