import java.util.Scanner;

public class Desafio_GFT_c4_06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Pimentoes amarelos");
        int a = leitor.nextInt();
        System.out.println("Pimentoes vermelhos");
        int b = leitor.nextInt();
        int total = a+b;
        System.out.println("X = "+ total);
    }
}