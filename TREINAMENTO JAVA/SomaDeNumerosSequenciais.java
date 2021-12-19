import java.util.Scanner;

public class SomaDeNumerosSequenciais {
    public static void main(String[] args) {
            int indice, soma, k;
            Scanner input= new Scanner(System.in);
            
            System.out.print("Digite a sequencia de numeros a serem somados: ");
            indice = input.nextInt();
            input.nextLine();
            soma = 0;
            k = 0;
            while(k < indice) {
                k = k + 1;
                soma = soma + k;
                System.out.print(k + ".. ");
            }
            input.close();
            System.out.print(" = "+ soma);
    }
}
