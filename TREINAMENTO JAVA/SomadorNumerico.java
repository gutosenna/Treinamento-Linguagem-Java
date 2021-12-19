import java.util.Scanner;

public class SomadorNumerico {
    public static void main(String[] args) {
        int cont, N, S, maior, menor;
        Scanner in = new Scanner(System.in);

        cont = 1;
        S = 0; menor = 0; maior = 0;
        while(cont <= 5) {
            System.out.print("Digite o" + cont + "o. valor: ");
            N = in.nextInt();
            if(N > maior) {
                maior = N;
            }
                
            
            if(cont == 1) {
                menor = N;
            }               
            // verifica se o menor valor
            if(N < menor) {
                menor = N;
            }
            S = S + N;
            cont = cont + 1;
        } in.close();
            
        System.out.println( "A soma de todos os valore foi " + S);
        System.out.println("O maior valor digitado foi: " + maior);
        System.out.println("O menor valor digitado foi: " + menor);
    }
}
