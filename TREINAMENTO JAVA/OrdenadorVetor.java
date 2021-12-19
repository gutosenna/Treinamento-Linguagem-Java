import java.util.Scanner;


public class OrdenadorVetor {
    public static void main(String[] args) {
            int[] vet = new int[5];
            int i, j, aux;
            Scanner leia = new Scanner(System.in);
 
        try {
            for(i = 1; i <= 4; i++) {
                System.out.print("Digite um valor: ");
                vet[i] = leia.nextInt();
            }            
            
            for(i = 1; i <= 3; i++) {
                for(j = i+1; j <= 4; j++) {
                    if(vet[i] > vet[j]) {
                        aux = vet[i];
                        vet[i] = vet[j];
                        vet[j] = aux;
                    }     
                }
            }            
            
            for(i = 1; i <= 4; i++) {
                System.out.println("{"+vet[i]+"}");
            }
        } finally {
            leia.close();
        }
    }   
}