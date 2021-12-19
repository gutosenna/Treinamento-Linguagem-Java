import java.util.Scanner;

public class ValoresMatriz {
    public static void main(String[] args) {
        int[][] m = new int[5][5];
        int l, c, sDP, p2L, mai3C;
        Scanner scanner = new Scanner(System.in);

        sDP = 0;
        p2L = 1;
        mai3C = 0;
        for(l = 1; l <= 4; l++) {
            for(c = 1; c <= 4; c++) {
                System.out.print("Digite o valor da Posicao [" + l + "," + c + "]: ");
                m[l][c] = scanner.nextInt();
                if(l == c) {
                    sDP = sDP + m[l][c]; 
                }
            }
              
        }           
        for(l = 1; l <= 4; l++) {
            for(c = 1; c <= 4; c++) {
              System.out.printf("   %-3d",m[l][c]);
            }
           System.out.println();
        }
        
        for(c = 1; c <= 4; c++) {
            p2L *= m[2][c];
        }
        for(l = 1; l <= 4; l++) {
           if(m[l][3] > mai3C) {
              mai3C = m[l][3];
           }
        }
        System.out.println("A soma dos valores da Diagonal principal e " +  sDP);
        System.out.println("O produto dos valores da Segunda linha e " +  p2L);
        System.out.println("O maior valor da Terceira Coluna e " +  mai3C);
        scanner.close();
    }
}
