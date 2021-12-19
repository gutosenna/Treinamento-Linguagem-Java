//import java.util.Arrays;
import java.util.Scanner;

public class LerMatriz {
    public static void main(String[] args) {
        int[][] m = new int[4][3];
        int l, c;
        Scanner teclado = new Scanner(System.in);
          
        for(l = 1; l <= 3; l++) {
            for(c = 1; c <= 2; c++) {
                //System.out.print("Digite o valor da posicao [" + l + "," + c + "]: ");
                System.out.printf("Digite o valor da posicao [%d , %d]: ",l,c);
                m[l][c] = teclado.nextInt();
            }      
        }
           
        for(l = 1; l <= 3; l++) {
            System.out.print("[  ");
            for(c = 1; c <= 2; c++) {
                //System.out.println(Arrays.deepToString(m.replaceAll("],", "]," + System.getProperty("line.separator")));
                System.out.printf("%-3d", m[l][c]);                
            }
            System.out.print("]");
            System.out.println();
        } teclado.close();
    }
}
