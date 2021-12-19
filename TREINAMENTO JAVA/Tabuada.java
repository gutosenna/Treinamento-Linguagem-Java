import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int cont, n, r;
        Scanner t = new Scanner(System.in);

        cont = 1;
        System.out.print("Quer ver a tabuada de qual numero? ");
        n = t.nextInt();
        
        do {
            r = n * cont;
            System.out.println(n +  " x " + cont +  " = " + r);
            cont = cont + 1;
        }            
        while(cont <= 10);
        t.close();
    }
}
