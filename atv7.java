public class atv7 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        System.out.println("*A* vale: " + A + " e *B* vale: " + B);
        try{
            System.out.println("Mas em alguns segundos...");
            Thread.sleep(1500);

            int C = A;
            A = B;
            B = C;
            System.out.println("Agora os valores estão invertidos!!");
            System.out.println("*A* vale: " + A + " e *B* vale: " + B);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("O processo foi interrompido.");
        }
    }
}
