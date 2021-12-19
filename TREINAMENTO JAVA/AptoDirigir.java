import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDate;


public class AptoDirigir extends LimpaConsole {
    public static void main(String[] args) throws IOException, InterruptedException {
        int ano;
        ano = LocalDate.now().getYear();
        
        int idade, anoAtual, anoNasc; 
        anoAtual = ano;       
        Scanner MeuObjeto  = new Scanner(System.in);        
        
        System.out.println("------------------------");
        System.out.println("DEPARTAMENTO DE TRANSITO");
        System.out.println("------------------------");
        System.out.println("Ano Atual (yyyy): " + anoAtual);
        anoAtual = ano;
        System.out.print("Ano de Nascimento (yyyy): ");
        anoNasc = MeuObjeto.nextInt();
        System.out.println(" ");

        LimpaConsole texto = new LimpaConsole();
        texto.limpar();

        System.out.println(" ");
        System.out.println("------- STATUS --------");
        idade = anoAtual - anoNasc;
        System.out.println("IDADE: "+ idade + " ANOS");
        if (idade >= 18) {
            System.out.println("APTO A TIRAR CARTEIRA");
            } else {
                System.out.println("INAPTO A TIRAR CARTEIRA");
            }           
            System.out.println("-----------------------");
            MeuObjeto.close();
        }           
    }

