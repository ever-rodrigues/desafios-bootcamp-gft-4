import java.util.Scanner;
public class Desafio_GFT_C4_10_Cobaias {
    public static void main(String[] args) {
                Scanner read = new Scanner(System.in);
                char c; // caracter de controle;
                double[] cob = {0.0,0.0,0.0}; // variável de controle da quantidade de animais de cada espécie;
                char[] spc = {'C','R','S'}; // Identificador reduzido/código de cada espécie;
                String[] txt = {"coelhos","ratos","sapos"}; // Identificador literal de cada espécie ;
                double smt = 0.0, input;  // Variáveis de controle: Quantidade geral de cobaias e entrada de dados;
                int lmt = read.nextInt(); // Quantidade de dados inseridos;
                for(int i = 0; i < lmt ; i++){
                    input = read.nextInt();
                    c = read.next().charAt(0);
                    for (int j = 0; j < spc.length; j++) {
                        if (c == spc[j]) {
                            cob[j] += input; } }
                    smt += input;
                }
                System.out.printf("Total: %.0f cobaias\n", smt);
                for (int i = 0; i < cob.length; i++)
                { System.out.printf("Total de %s: %.0f\n", txt[i], cob[i]); }
                for (int i = 0; i < cob.length; i++)
                { System.out.printf("Percentual de %s: %.2f %%\n", txt[i], (cob[i] / smt) *100 ); }
            }
        }