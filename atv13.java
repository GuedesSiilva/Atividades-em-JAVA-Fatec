import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade total de segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.println(totalSegundos + " segundos equivalem a:");
        System.out.println(horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)");

        sc.close();
    }
}
