import java.util.Scanner;

public class Desafio_GFT_C4_09_Matriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for(int linha=0;linha<11;linha++){
            for(int coluna=0;coluna<11;coluna++){
                M[linha][coluna]=leitor.nextInt();
            }
            for(linha=1;linha<11;linha++){
                for(int coluna=7;coluna<=11;coluna++){
                    if ((linha!=coluna) && (coluna-linha>0))
                        System.out.println(M[linha][coluna]);
                        soma+=M[linha][coluna];
                    }

                }
            }
        }

    }

