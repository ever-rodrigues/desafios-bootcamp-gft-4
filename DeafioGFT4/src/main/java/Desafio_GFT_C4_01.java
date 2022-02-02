import java.util.Scanner;

public class Desafio_GFT_C4_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, media=0;
        System.out.println("Valor para A:");
        A = sc.nextDouble();
        System.out.println("Valor para B:");
        B = sc.nextDouble();
        if(A<10 && B<10){
            media = (A*3.5+B* 7.5)/11;
        }
        System.out.printf("MEDIA = %.5f",media);
        System.out.println();
    }
}