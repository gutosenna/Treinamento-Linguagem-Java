import java.util.*;

public class Turma {
    public static void main(String[] args) {
            String[] nome = new String[5];
            double[] n1 = new double[5];
            double[] n2 = new double[5];
            double[] m = new double[5];
            int i, tot = 0;
            double sm = 0, mt = 0;
            Scanner teclado = new Scanner(System.in);

                try {
                    for(i = 1; i <= 4; i++) {
                        System.out.println("ALUNO "+i);
                        System.out.print("Nome: ");
                        nome[i] = teclado.nextLine();
                        System.out.print("Primeira nota: ");
                        n1[i] = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.print("Segunda nota: ");
                        n2[i] = teclado.nextDouble();
                        teclado.nextLine();
                        m[i] = (n1[i] + n2[i])/ 2;
                        sm = sm + m[i];
                    }                
                mt = sm/4;
              
                System.out.println("LISTAGEM DE ALUNOS");
                System.out.println("------------------");
                for(i = 1; i <= 4; i++) {
                    System.out.printf(" %-8.15s-    %.1f\n",nome[i], m[i]);
                    if(m[i] > mt) {
                        tot = tot + 1;
                    }                    
                } 
            } finally {
                teclado.close();
                System.out.printf("Ao todo temos %d alunos acima da media da turma que e %.1f",tot, mt); 
            }
               
            
    }
}
