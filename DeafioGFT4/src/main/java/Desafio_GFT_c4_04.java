import java.util.Scanner;

public class Desafio_GFT_c4_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio");
        double raio=scan.nextDouble();
        double area;
        area = 3.14159 * (Math.pow(raio,2));
        System.out.printf("A=%.4f\n", area);
    }
}
