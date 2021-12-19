import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        int c, n, contDiv;
        Scanner input = new Scanner(System.in);
        c = 1;
        contDiv = 0;
        System.out.print("Digite um numero: ");
        n = input.nextInt();
        input.close();
        do {
            if(n % c == 0) {
                contDiv++;
            }
            c++;
        } while(c <= n);
            if(contDiv > 2) {
                System.out.print("O numero " + n + " nao eh primo");
        
            } else {
                 System.out.print("O numero " + n + " eh primo");
              }
    }
}
