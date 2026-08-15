import java.text.DecimalFormat;
import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        String STRvalor1 = scan.nextLine();
        double valor1 = Double.parseDouble(STRvalor1.replace(",", "."));

        System.out.println("Digite o segundo valor: ");
        String STRvalor2 = scan.nextLine();
        double valor2 = Double.parseDouble(STRvalor2.replace(",", "."));

        double soma = valor1 + valor2;
        double sub = valor1 - valor2;
        double mult = valor1 * valor2;
        double div = valor1 / valor2;
        double res = valor1 % valor2;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("""
                Soma = %s
                Subtração = %s
                Multiplicação = %s
                Divisão = %s
                Resto da Divisão = %s
                """.formatted(
                    df.format(soma), 
                    df.format(sub), 
                    df.format(mult), 
                    df.format(div), 
                    df.format(res))
                );
    scan.close();
    }
}