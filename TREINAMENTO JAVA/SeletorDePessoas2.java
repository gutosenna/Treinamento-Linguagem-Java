import java.util.Scanner;

public class SeletorDePessoas2 {
    public static void main(String[] args) {
        int idade, cab, cabH, cabM, totalH, totalM,
        idadeH, idadeMI, idadeMF;
        String cabPadraoH, cabPadraoM; 
        char sexo, resp;
        Scanner teclado = new Scanner(System.in);

        totalH = 0;
        totalM = 0;
        cabH = 0;
        cabM = 0;
        System.out.println("========================");
        System.out.println("   SELETOR DE PESSOAS   ");
        System.out.println("========================");
        System.out.println("Cadastre os valores ");
        System.out.print("A faixa etaria do Homem sera a partir de ");
        idadeH = teclado.nextInt();
        System.out.print("A faixa etaria da Mulher sera entre ");
        idadeMI = teclado.nextInt();
        System.out.print("e ");
        idadeMF = teclado.nextInt();
        System.out.print("O cabelo Padrao do Homem eh ");
        cabPadraoH = teclado.next();
        System.out.print("O cabelo Padrao da Mulher eh ");
        cabPadraoM = teclado.next();
        if(cabPadraoH.equals("Preto") || cabPadraoH.equals("preto") || cabPadraoH.equals("Pretos") || cabPadraoH.equals("pretos")) {
            cabH = 1;
        }           
        else if (cabPadraoH.equals("Castanhos") || cabPadraoH.equals("castanhos") || cabPadraoH.equals("Castanho") || cabPadraoH.equals("castanho")) {
            cabH = 2;
        }              
          else if (cabPadraoH.equals("Loiros") || cabPadraoH.equals("loiros") || cabPadraoH.equals("Loiro") || cabPadraoH.equals("loiro")) {
            cabH = 3;
          }                
           else if (cabPadraoH.equals("Ruivo") || cabPadraoH.equals("ruivo") || cabPadraoH.equals("Ruivos") || cabPadraoH.equals("ruivos")) {
                cabH = 4;
            }
           
        if(cabPadraoM.equals("Preto") || cabPadraoM.equals("preto") || cabPadraoM.equals("Pretos") || cabPadraoM.equals("pretos")) {
            cabM = 1; 
        }           
        else if (cabPadraoM.equals("Castanhos") || cabPadraoM.equals("castanhos") || cabPadraoM.equals("Castanho") || cabPadraoM.equals("castanho")) {
            cabM = 2;
        }             
           else if (cabPadraoM.equals("Loiros") || cabPadraoM.equals("loiros") || cabPadraoM.equals("Loiro") || cabPadraoM.equals("loiro")) {
            cabM = 3;
           }                
              else if (cabPadraoM.equals("Ruivo") || cabPadraoM.equals("ruivo") || cabPadraoM.equals("Ruivos") || cabPadraoM.equals("ruivos")) {
                cabM = 4; 
              }         
        do {
                System.out.println("========================");
                System.out.println("   SELETOR DE PESSOAS   ");
                System.out.println("========================");
                System.out.print ("Qual o Sexo? [M/F] ");
                sexo = teclado.next().charAt(0);
                System.out.print ("Qual a idade? ");
                idade = teclado.nextInt();
                System.out.println("Qual a cor do Cabelo? ");
                System.out.println("----------------------");
                System.out.println("[1] Preto");
                System.out.println("[2] Castanho");
                System.out.println("[3] Loiro");
                System.out.println("[4] Ruivo");
                cab = teclado.nextInt();
                System.out.print ("Quer continuar? [S/N] ");
                resp = teclado.next().charAt(0);
                if(sexo =='M' || sexo == 'm' && cab == cabH && idade >= idadeH) {
                    totalH++;
                }                   
               
                if(sexo == 'F' || sexo == 'f' && cab == cabM && (idade >= idadeMI && idade <= idadeMF)) {
                    totalM++;
                }
        }           
        while(resp == 'S' || resp == 's');
        teclado.close();

        System.out.println("----------------------");
        System.out.println("    RESULTADO FINAL   ");
        System.out.println("----------------------");
        System.out.println("Total de homens com mais de " + idadeH + " anos e cabelos " + cabPadraoH + " " + totalH);
        System.out.println("Total de mulheres entre " + idadeMI + " e " + idadeMF + " anos e cabelos " + cabPadraoM + " " + totalM);
    }
}
