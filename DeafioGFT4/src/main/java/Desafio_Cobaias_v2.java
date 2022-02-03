import java.util.Scanner;

public class Desafio_Cobaias_v2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String[] cobaias={"coelhos","ratos","sapos"};
        char[] c={'C','R','S'};
        double quantCobaia;
        char tipoCobaia;
        double totalTeste;
        System.out.println("Digite o total de testes a serem realizados:");
        totalTeste=scan.nextInt();
        Double[] quantidadeCobaias={0.0,0.0,0.0};
        Double somaTotal=0.0;
        for(int i=0;i<totalTeste;i++){
            System.out.println("Digite o tolal de cobaias e o tipo");
            quantCobaia=scan.nextInt();
            tipoCobaia=scan.next().charAt(0);
//            System.out.println(quantCobaia);
//            System.out.println(tipoCobaia);
            for(int k=0;k<c.length;k++){
                if(tipoCobaia==c[k]){
                    quantidadeCobaias[k]+=quantCobaia;
                }
            }
            somaTotal+=quantCobaia;
            }
        System.out.printf("Total: %.0f cobaias\n",somaTotal);
        for(int j=0;j<quantidadeCobaias.length;j++){
            System.out.printf("Total de %s: %.0f\n",cobaias[j],quantidadeCobaias[j]);
        }
        for (int l=0;l<quantidadeCobaias.length;l++){
            System.out.printf("Percentual de %s: %.2f %%\n",cobaias[l],(quantidadeCobaias[l]/somaTotal)*100);
        }
    }
}
