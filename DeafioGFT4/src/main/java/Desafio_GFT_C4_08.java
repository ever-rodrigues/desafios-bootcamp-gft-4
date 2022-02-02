import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio_GFT_C4_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor:");
        double valor =scan.nextDouble();
        System.out.println(String.format((String.valueOf(valor).startsWith("-") ? "" : "+") + "%.4E", valor));
    }
}
