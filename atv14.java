import java.util.Scanner;

public class atv14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Digite o valor pago: ");
        double valorPago = sc.nextDouble();

        double troco = valorPago - preco;

        System.out.println("O troco é: " + troco);

        sc.close();
    }
}
