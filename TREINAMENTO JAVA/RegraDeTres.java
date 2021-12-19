import java.util.Scanner;

public class RegraDeTres {
    public static void main(String[] args) {
        double x, y, valor;
        Scanner t = new Scanner(System.in);
        System.out.println("Regra de 3");
        System.out.println("x% de y = valor");
        System.out.print("Digite o valor de (x): ");
        x = t.nextDouble();
        System.out.print("Digite o valor de (y): ");
        y = t.nextDouble();

        valor = (x * y)/100;
        System.out.println(x + "%" + " de " + y + " = " + valor);
        t.close();
    }
}
