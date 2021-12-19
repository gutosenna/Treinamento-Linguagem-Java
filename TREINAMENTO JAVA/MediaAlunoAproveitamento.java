import java.util.Scanner;

public class MediaAlunoAproveitamento {
    public static void main(String[] args) {
            float nota1, nota2, media;
            Scanner t = new Scanner(System.in);
            System.out.println("------------------------");
            System.out.println("ESCOLA JAVALI CANSADO");
            System.out.println("------------------------");
            System.out.print("Primeira Nota: ");
            nota1 = t.nextFloat();
            System.out.print("Segunda Nota: ");
            nota2 = t.nextFloat();
            t.close();
            System.out.println(" ");
            System.out.println("-----------------------");
            media = (nota1 + nota2)/2;
            System.out.println("MEDIA: "+ media);
            if(media >= 9 && media <= 10) {
                System.out.println("APROVEITAMENTO: A");
            } else if (media >= 8 && media < 9) {
                System.out.println("APROVEITAMENTO: B");
            } else if (media >= 7 && media < 8) {
                System.out.println("APROVEITAMENTO: C");
            }
             else if(media >=6 && media <7) {
                        System.out.println("APROVEITAMENTO: D");
                    }  
                    else if (media >= 5 && media < 6) {
                            System.out.println("APROVEITAMENTO: E");
                        } 
                        else if (media < 5) {
                            System.out.println("APROVEITAMENTO: F");
                        }
                         else {
                                System.out.println("APROVEITAMENTO INEXISTENTE");
                            }
                            System.out.println("-----------------------");
    }
}
