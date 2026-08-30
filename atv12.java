import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println(celsius + "°C equivalem a " + fahrenheit + "°F");

        sc.close();
    }
}
