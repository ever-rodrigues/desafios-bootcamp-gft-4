import java.util.Scanner;

public class Desafio_GFT_C4_02 {
    public static void main(String[] args) {
        int numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        numero=scan.nextInt();
        for(int i=1;i<=numero;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
