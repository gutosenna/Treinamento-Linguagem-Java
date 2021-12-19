import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        int[] v = new int[6];
        int c;
        Scanner scanner = new Scanner(System.in);
 
        try {
            for(c = 0; c < 6; c++) {
                System.out.printf("Digite o %do. valor: ",c+1);
                v[c] = scanner.nextInt();
            }
               
            for(c = 0; c < 6; c++) {
                System.out.print("{" + v[c] + "}");
            }
        } finally {
            scanner.close();
        }
    }
}
