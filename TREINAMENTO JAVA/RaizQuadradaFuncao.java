import java.util.Scanner;

public class RaizQuadradaFuncao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int raiz = 0,r, n;
    
        try {
            System.out.print("Digite um número: ");
        n = in.nextInt();
        for(r = 0; r <= n; r++) {
            if(r * r == n) {
                raiz = r;
            }
        }            
        if(raiz * raiz == n) {
        System.out.printf(" A raiz de %d eh: %d " , n, raiz);  
        } else {
            System.out.printf("%d Não tem raiz exata! ",n);
          }
        } finally {
            in.close();
        } 
    }
}
