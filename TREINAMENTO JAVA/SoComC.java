import java.util.Scanner;

public class SoComC {
    public static void main(String[] args) {
            String nome;
            String[] soC = new String[10];
            int c, tot;
            char result;
            Scanner in = new Scanner(System.in);
            
            try {
                tot = 0;
            for(c = 1; c <= 10; c++) {
                System.out.print("Digite seu nome: " );
                nome = in.nextLine();
                result = nome.charAt(0);
                if(result == 'C' || result == 'c') {
                    tot = tot + 1;
                    soC[tot] = nome;
                }
            }
            System.out.println("LISTAGEM FINAL");
            for(c = 1; c <= tot; c++) {
                System.out.println(soC[c]);
            }
        } finally {
            in.close();
      }
                
    }
}
