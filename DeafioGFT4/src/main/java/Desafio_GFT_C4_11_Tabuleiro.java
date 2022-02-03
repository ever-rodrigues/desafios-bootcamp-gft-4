import java.util.Scanner;

public class Desafio_GFT_C4_11_Tabuleiro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do tabuleiro");
        int tamanho = scan.nextInt();
        int tabuleiro[][]=new int[tamanho][tamanho];
        int x=0;
        int r=0;
        System.out.println("Digite a operacao");
        int operacao=scan.nextInt();
        int tipoOperacao;
        if(tamanho<105&&tamanho>0){
            for(int linha=0;linha<tamanho;linha++){
                for(int coluna=0;coluna<tamanho;coluna++){
                    tabuleiro[linha][coluna]=0;
                    System.out.print(tabuleiro[linha][coluna]);
                }
                System.out.println("");
                for(int i=0;i<operacao;i++){
                    System.out.println("Digite o tipo da operacao");
                    tipoOperacao=scan.nextInt();
                    switch (tipoOperacao){
                        case 1:
                        case 2:
                            x=1;
                            r=1;
                        case 3:
                        case 4:
                            x=1;

                    }
                }
            }

        }

    }
}
