import java.util.Scanner;

public class Desafio_GFT_c4_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int colunaOrigem,linhaOrigem,cdestino,ldestino;

        while(true){
            System.out.println("Valor");
            linhaOrigem = sc.nextInt();
            System.out.println("Valor");
            ldestino = sc.nextInt();
            System.out.println("Valor");
            colunaOrigem = sc.nextInt();
            System.out.println("Valor");
            cdestino = sc.nextInt();

            if(linhaOrigem == 0 && colunaOrigem == 0 && ldestino == 0 && cdestino == 0) break; //condição de parada
            if(linhaOrigem==colunaOrigem && ldestino==cdestino){
                System.out.println("0");
            }
            else if(linhaOrigem==ldestino && colunaOrigem!=cdestino && linhaOrigem<colunaOrigem && ldestino>cdestino){
                System.out.println("1");
            }
            else if(linhaOrigem==ldestino && colunaOrigem!=cdestino &&linhaOrigem>colunaOrigem && ldestino>cdestino)
                System.out.println("2");
            else
                System.out.println("1");
        }
        sc.close();
    }
}