import java.util.Scanner;

public class MenuOpcao {
    public static void main(String[] args) {
        byte r, c;
        Scanner tc = new Scanner(System.in);
        do {
            System.out.println("=================");
            System.out.println("|    M E N U    |");
            System.out.println("=================");
            System.out.println("| [1] De 1 a 10 |");
            System.out.println("| [2] De 10 a 1 |");
            System.out.println("| [3] Sair      |");
            System.out.println("=================");
            r = tc.nextByte();            
            if(r == 1) {
                c = 1;
                do {
                    System.out.print(c + ".. ");
                    c++;
                }                    
                while(c <= 10);
                System.out.println(" ");
            }    
            else if(r == 2) {
                c = 10;
                do {
                    System.out.print(c+".. ");
                    c--;
                }                    
                while(c >= 0);
                System.out.println(" ");
            }
            else {
                    System.out.print("SAINDO...");
                }
                   
            } while(r != 3);
            tc.close();
    }
}
