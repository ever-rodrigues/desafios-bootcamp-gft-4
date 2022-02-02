import java.util.Scanner;

public class Desafio_GFT_c4_05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor para A:");
        double A = leitor.nextDouble();
        System.out.println("Digite o valor para B:");
        double B = leitor.nextDouble();
        double porcentagem;
        if(A<=B && B<=1000){
            porcentagem=((B*100)/A)-100;
            System.out.printf("%.2f%%",porcentagem);
        }
    }
}
