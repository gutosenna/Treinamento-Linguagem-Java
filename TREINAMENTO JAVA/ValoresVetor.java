import java.util.Scanner;

public class ValoresVetor {
    public static void main(String[] args) {
        int[] val = new int[8];
        int i, totPar;
        Scanner sc = new Scanner(System.in);

        try {
            totPar = 0;
            for(i = 1; i <= 7; i++) {
                System.out.printf("Digite o %do. valor:",i);
                val[i] = sc.nextInt();
            }           

            for(i = 1; i <= 7; i++) {
                if(val[i] % 2 == 0) {
                    totPar = totPar + 1;
                    System.out.println("Valor PAR na posicao " +i);
                }
        }            
        System.out.println("O total de pares foi " + totPar);
        } finally {
            sc.close();
        }
    }
}
