import java.util.Scanner;

public class ValoresPares {
    public static void main(String[] args) {
        int cont, cont2, v, v2;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um valor: ");
        v = scanner.nextInt();
        for(cont = 0; cont <= v; cont+=2) {
            System.out.println(cont);
        }
        System.out.print("Digite um valor: ");
        v2 = scanner.nextInt();
        if(v2%2==1) {
            v2--;
        }
        for(cont2 = v2; cont2 >= 0; cont2-=2) {
            System.out.println(cont2);
        }
      } finally {
            scanner.close();
    }
  }
}
