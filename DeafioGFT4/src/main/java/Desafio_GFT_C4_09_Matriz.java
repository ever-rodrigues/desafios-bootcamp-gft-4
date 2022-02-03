import java.util.Scanner;

public class Desafio_GFT_C4_09_Matriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float soma = 0f;
        char O = leitor.next().toUpperCase().charAt(0);
        float[][] matriz = new float[12][12];
        int linha;
        int coluna;
        float contador=0f;
        for (linha = 0; linha <= 11; linha++) {
            for (coluna = 0; coluna <= 11; coluna++) {
                matriz[linha][coluna] = leitor.nextFloat();
                if((linha>=1 && linha <11 && coluna==11)) {
                    soma = soma + matriz[linha][coluna];
                    contador++;
                }
                if((linha>=2&& linha<10 && coluna==10)){
                    soma=soma+matriz[linha][coluna];
                    contador++;
                }
                if((linha>=3 &&linha<9 &&coluna==9)){
                    soma=soma+matriz[linha][coluna];
                    contador++;
                }
                if((linha>=4 &&linha<8 &&coluna==8)){
                    soma=soma+matriz[linha][coluna];
                    contador++;
                }
                if((linha>=5 &&linha<7 &&coluna==7)){
                    soma=soma+matriz[linha][coluna];
                    contador++;
                }
            }

        }
        if(O=='S'){
            System.out.printf("%.1f",soma);
        }
        else{
            System.out.printf("%.1f",soma/contador);
        }

    }
}
