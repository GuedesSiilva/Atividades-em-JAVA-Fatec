import java.util.Scanner;

public class atv15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (km): ");
        double distancia = sc.nextDouble();

        System.out.print("Digite a quantidade de combustível consumida (litros): ");
        double combustivel = sc.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.println("O consumo médio é: " + consumoMedio + " km/l");

        sc.close();
    }
}
