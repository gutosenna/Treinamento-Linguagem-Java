import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {
        System.out.println("Digite um valor");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        
        int resto = n % 2; // RESTO DA DIVISÃO POR 2
        double cubo = Math.pow(n,3); // ELEVA AO CUBO
        double raizQ = Math.sqrt(n); // RAIZ QUADRADA
        double raizC = Math.cbrt(n); // RAIZ CUBICA
        int abs = Math.abs(n); // RETORNA O VALOR ABSOLUTO
       System.out.println(Integer.toString(resto));
       System.out.println(String.format("%.0f",cubo));
       System.out.println(String.format("%.2f",raizQ));
       System.out.println(String.format("%.2f",raizC));
       System.out.println(Integer.toString(abs));

       
    }
}
