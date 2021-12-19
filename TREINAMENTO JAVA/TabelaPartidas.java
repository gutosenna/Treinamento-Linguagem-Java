import java.util.Scanner;

public class TabelaPartidas {
    public static void main(String[] args) {
        String[] v = new String[4];
        int i, j;
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("---------------------");
        System.out.println("CAMPEONATO DE FUTEBOL");
        System.out.println("---------------------");

        for(i = 1; i <= 3; i++) {
            System.out.print("Nome do " + i + "o. time: ");
            v[i] = input.next();
        }
        System.out.println("--------------------");
        System.out.println(" TABELA DE PARTiDAS ");
        System.out.println("--------------------");
        for(i = 1; i <= 3; i++) {
            for(j = 1; j <= 3; j++) {
                if(v[i] != v[j]) {
                    System.out.printf("%-8s   [ ] x [ ]   %-8s\n" ,v[i], v[j]);
                }               
            }                
          } 
        } finally {
            input.close();
        }
    }
}
