import java.util.Scanner;

public class Triangulo {    
    public static void main(String[] args) {
        float l1, l2, l3;
        boolean eq, es, tri, iso;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        l1 = teclado.nextFloat();
        System.out.print("Digite o segundo lado: ");
        l2 = teclado.nextFloat();
        System.out.print("Digite o terceiro lado: ");
        l3 = teclado.nextFloat();
        tri = (l1 <= l2 + l3) && (l2 <= l1 + l3) && (l3 <= l1 + l2);
        eq = (l1 == l2) && (l2 == l3);
        es = (l1 != l2) && (l2 != l3) && (l1 != l3);
        iso = (tri && (l1 == l2) || (l2 == l3) || (l1 == l3));
        System.out.println("Pode formar um TRIANGULO? "+ tri);
        System.out.println("O triangulo EQUILATERO? "+ eq);
        System.out.println("O triangulo eh ESCALENO? "+ es);
        System.out.println("O triangulo eh ISOCELES? "+ iso);

        teclado.close();
    }
}
