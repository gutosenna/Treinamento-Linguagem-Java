import java.util.Scanner;

public class MatrizPar {
    public static void main(String[] args) {
        int[][] valores = new int[4][4];
        int l, c, totPar;
        Scanner input = new Scanner(System.in);
    
        for(l = 1; l <= 3; l++) {
            for(c = 1; c <= 3; c++) {
                System.out.print("Digite o valor da posicao [" + l + "," + c + "] :");
                valores[l][c] = input.nextInt();
            }              
        }           
        System.out.println();
        System.out.println("   MATRIZ:");
        System.out.println("-------------");
        totPar = 0;
        for(l = 1; l <= 3; l++) {
            for(c = 1; c <= 3; c++) {
              if(valores[l][c] % 2 == 0) {
                System.out.print("{" + valores[l][c] + "}");
                totPar++;
              }                 
              else {
                System.out.print(" " + valores[l][c] + " ");
              }
            }
           System.out.println();
        }
        System.out.println();
        System.out.print("O numero de PARES sao: " + totPar);
        System.out.println();
        input.close();
    }
}
