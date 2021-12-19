import java.util.Scanner;

public class SomaFuncao {
    public static int soma(int a, int b) {
            return a + b;
    }
        
    public static void main(String[] args) {
        int v1, v2, s;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        v1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        v2 = input.nextInt();
        input.close();
        s = soma(v1,v2);
        System.out.print("A some entre os numeros " + v1 + " e " + v2 + " eh:" + s);
    }
}
