import java.util.Scanner;
public class Desafio_GFT_C4_10_Cobaias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c;
        double[] somaCobaias={0.0,0.0,0.0};
        char[] specificacaoCobaias={'C','R','S'};
        String[] cobaias={"Coelho","Rato","Sapo"};
        double somaTotal=0.0;
        System.out.println("Digite o total de insercoes");
        double contador = scan.nextInt();
        double entradaDados;
        for(int i=0;i<contador;i++){
            System.out.println("Digite o numero de cobaia e o tipo:");
            entradaDados=scan.nextInt();
            c=scan.next().charAt(0);
            for(int j=0;j<specificacaoCobaias.length;j++){
                if(c==specificacaoCobaias[j]){
                    somaCobaias[j]+=entradaDados;
                }
            }
            somaTotal+=entradaDados;
            System.out.println("Total de cobaias "+somaTotal);
            for(int k=0;k<somaCobaias.length;k++){
                System.out.printf("Total de %s: %.0f\n",cobaias[k],somaCobaias[k]);
            }
            for(int l =0;l<somaCobaias.length;l++){
                System.out.printf("Percentual de %s: %.2f %%n",cobaias[l],(somaCobaias[l]/somaTotal)*100);
            }

        }
    }
}