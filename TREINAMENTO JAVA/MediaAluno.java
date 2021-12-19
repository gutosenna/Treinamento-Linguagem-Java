import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        float nota1, nota2, media;
        Scanner entrada = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("ESCOLA JAVALI CANSADO");
        System.out.println("------------------------");
        System.out.print("Primeira Nota: ");
        nota1 = entrada.nextFloat();
        System.out.print("Segunda Nota: ");
        nota2 = entrada.nextFloat();
        entrada.close();
        System.out.println(" ");
        System.out.println("-----------------------");
        media = (nota1 + nota2)/2;
        System.out.println("MEDIA: "+ media);
        if(media >= 7) {
            System.out.println("ALUNO APROVADO");
        }            
        else if(media >= 5 && media < 7) {
            System.out.println("ALUNO EM RECUPERACAO");
        }
               
            else {
                System.out.println("ALUNO REPROVADO");
            }
        System.out.println("-----------------------");
    }
}
