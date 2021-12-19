import java.util.Scanner;
/*System.out.print um public static void que recebe as 3 notas de um aluno por parâmetro;
 * uma letra. se a letra for A o public static void
 * calcula a média aritmética das notas do aluno, se for P,
 * a sua média ponderada (pesos: 5, 3 e 2) e se for H, a sua média harmônica.
 * A média calculada também deve retornar por parâmetro.*/
public class TiposMediasAlunos {
    public static float[] m = new float[5];
    public static int i;

    public static void tela() {
        System.out.println("Digite o Parametro de calculo de nota");
        System.out.println("---------------------------------------");
        System.out.println("[A] - media Aritmetica ");
        System.out.println("[P] - media Ponderada ");
        System.out.println("[H] - media Harmonica ");
        System.out.println("[X] - SAIR ");
        System.out.println("---------------------------------------");
    }              
    public static void mediaAritmetica(float s) {
        float media;

        media = s/3;
        System.out.println("A media Aritmetica eh: "+ media);
    }   
    public static void mediaPonderada() {
        float mediaP;

        mediaP = (m[1] * 5 + m[2] * 3 + m[3] * 2)/(5 + 3 + 2);
        System.out.println("A media Ponderada eh: "+ mediaP);
    }
    public static void mediaHarmonica() {
        float mediaH;
        
        mediaH = 3 /(1/m[1] + 1/m[2] + 1/m[3]);
        System.out.println("A media Harmonica eh: " + mediaH);      
    }        
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);       
        float soma;
        String resp, op = null;
        

        do {
        soma = 0;
        for(i = 1; i <= 3; i++) {
            System.out.print(" Digite a "+i+"a. nota: ");
            m[i] = teclado.nextFloat();
            soma += m[i];
        }                
        tela();
        resp = teclado.next();
        switch(resp) {
            case "A":
            case "a":
                mediaAritmetica(soma);
                System.out.print("Deseja continuar? [s/n]");
                op = teclado.next();
                break;
            case "P":
            case "p":
                mediaPonderada();
                System.out.print("Deseja continuar? [s/n]");
                op = teclado.next();
                break;
            case "H":
            case "h":
                mediaHarmonica();
                System.out.print("Deseja continuar? [s/n]");
                op = teclado.next();
                break;
            case "X":
            case "x":
                op = "n";
                break;
            default:
                break;
        }                
            if(op.equals("n") || op.equals("N")) {
                resp = "x";
            }            
            else if(!op.equals("s") || !op.equals("S")) {
                System.out.println("opcao invalida!!!");
                System.out.println();
                System.out.println("Digite uma opcao valida!");
            } else {
                    break;
                }
        }             
        while(!resp.equals("X") || !resp.equals("x"));
        System.out.print("SAINDO...");
        teclado.close();
    }
}
