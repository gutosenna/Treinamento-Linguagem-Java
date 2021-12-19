import java.util.Scanner;

public class ReservaCinema {
    public static String[] cad = new String[20];

    public static void tela() {
        int j;
        
        for(j = 1; j <= 10; j++) {
            if(cad[j] == null) {
                System.out.print("[ B"+ j +"] ");
            }                
            else {
                System.out.print("[ --- ]");
            }
        }
            
        System.out.println();
        System.out.println("-------------------------------------------------------");
    }        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cd;
        char resp;

        do {
            tela();
            System.out.print("Reservar a cadeira: B");
            cd = scanner.nextInt();
            if(cad[cd] == null) {
                cad[cd] = "X";
                System.out.println("cadeira B" + cd + " RESERVADA!");
            }
                
            else {
                System.out.println("ERRO! Lugar Ocupado!");
            }
            System.out.print("Quer reservar outro: [S/N] ");
            resp = scanner.next().charAt(0);
        }    
        while(resp == 'S' || resp == 's');
        scanner.close();
    }
    
}