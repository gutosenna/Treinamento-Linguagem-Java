import java.util.Scanner;

public class ContadorInteligente {
    public static void main(String[] args) {
        int cont, i, f;
        Scanner input = new Scanner(System.in);
            
        System.out.println("CONTAGEM INTELIGENTE");
        System.out.println("--------------------");
        System.out.print("Inicio: ");
        i = input.nextInt();
        System.out.print("Fim: ");
        f = input.nextInt();
        input.close();
        System.out.println("--------------------");
        System.out.println("      CONTANDO      ");
        System.out.println("--------------------");
        if(f > i) {
            cont = i;
            while(cont <= f) {
                System.out.print(cont + ".. ");
                cont++;            
            }                
        }          
        if(f < i) {
            cont = i;
            while(cont >= f) {
                System.out.print(cont + ".. ");
                cont--;
            }                
        }          
    }
}
