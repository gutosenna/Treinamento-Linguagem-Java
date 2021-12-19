import java.util.Scanner;

public class ContaNegativos {
    public static void main(String[] args) {
        int n, c, totN;
        Scanner teclado = new Scanner(System.in);

        c = 1;
        totN = 0;
        do {
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();            
            if(n < 0) {
                totN++;
            }               
            c++;
        } while(c <= 5) ;
        teclado.close();
        System.out.println("Foram digitados "+ totN + " valores negativos.");
    } 
}
