import java.util.Scanner;

public class LeitorPensamento {
    public static void main(String args[]) {
        // sorteia um numero aleatorio entre 1 e 5
        double n = 1 + Math.random() * (6 - 1);
        int valor = (int) n;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Vou pensar em um valor entre 1 e 5. Tente adivinhar ");
        // pega o numero digitado
        System.out.print("Palpite: ");
        int num = teclado.nextInt();
        
        String f1 = "ACERTOU!";
        String f2 = "ERROU! Eu pensei no valor " + valor;
        
        String res = (valor == num)?f1:f2;        
        
        System.out.print(res);
        teclado.close();
    }
}
