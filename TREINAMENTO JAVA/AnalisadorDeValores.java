import java.util.Scanner;

public class AnalisadorDeValores {
   public static void main(String[] args) {
       int C, V, SV, D, N, SP = 0;
       float media = 0;
        SV = 0;
        D = 0;
        N = 0;
        SP = 0;
        for (C = 1; C <= 5; C++) {
            System.out.print("Digite o "+C+"o. Valor: ");
            V = new Scanner(System.in).nextInt();            
            SV = SV + V;
            media = SV/5;
            if(V % 5 == 0) {
                D++; 
            } 
            if (V == 0) {
                N++;
            } 
            if (V % 2 == 0) {
                SP = SP + V;
            }                        
        }
        new Scanner(System.in).close();  
        System.out.println("A soma entre os valores eh "+ SV);
        System.out.println("A media entre os valores eh "+ media);
        System.out.println("Valores divisiveis por cinco: "+ D);
        System.out.println("Valores nulos: "+ N);
        System.out.println("A soma dos valores pares eh "+ SP);

        
   } 
}
