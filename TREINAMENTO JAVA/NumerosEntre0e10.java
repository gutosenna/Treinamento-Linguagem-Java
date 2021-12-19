import java.util.Scanner;

public class NumerosEntre0e10 {
    public static void main(String[] args) {
            int c, v, tot010, sImp;
            Scanner entradaDeDados = new Scanner(System.in);
        
            tot010 = 0;
            sImp = 0;
            try {
                for(c = 1; c <= 6; c++) {
                    System.out.print("Digite um valor: ");
                    v = entradaDeDados.nextInt();
                    if(v >= 0 && v <= 10) {
                        tot010 = tot010 + 1;
                       if(v%2 == 1) {
                        sImp = sImp + v;
                       }
                    }
                }
            } finally {
                entradaDeDados.close();  
                System.out.println("Ao todo foram "+tot010+" valores entre 0 e 10");
                System.out.println("Nesse intervalo, a soma de impares foi "+ sImp);
        }  
    }
}
