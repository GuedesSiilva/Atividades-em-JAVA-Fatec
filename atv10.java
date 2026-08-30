import java.util.Scanner;

public class atv10{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        String STRvalor1 = scan.nextLine();
        double valor1 = Double.parseDouble(STRvalor1.replace(",", "."));

        System.out.println("Digite a nota 2: ");
        String STRvalor2 = scan.nextLine();
        double valor2 = Double.parseDouble(STRvalor2.replace(",", "."));

        System.out.println("Digite a nota 3: ");
        String STRvalor3 = scan.nextLine();
        double valor3 = Double.parseDouble(STRvalor3.replace(",", "."));

        try{
            System.out.println("Realizando o calculo da nota...");
            Thread.sleep(1500);

            double media = (valor1+valor2+valor3)/3;

            System.out.printf("A média do aluno é : %.2f ", media);

        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("O processo foi interrompido.");
        }
        scan.close();
    }
}