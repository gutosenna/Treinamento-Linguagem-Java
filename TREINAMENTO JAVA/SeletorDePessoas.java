import java.util.Scanner;

public class SeletorDePessoas {
    public static void main(String[] args) {
            int idade, cab, totalH, totalM,
            idadeH, idadeMI, idadeMF;
            String cabPadraoH, cabPadraoM;
            char sexo,  resp;
            Scanner entrada = new Scanner(System.in);

            idadeH = 18;
            idadeMI =25;
            idadeMF = 30;
            cabPadraoH = "Castanhos";
            cabPadraoM = "Loiros";
            totalH = 0;
            totalM = 0;
            do {
                System.out.println("========================");
                System.out.println("   SELETOR DE PESSOAS   ");
                System.out.println("========================");
                System.out.print("Qual o Sexo? [M/F] ");
                sexo = entrada.next().charAt(0);
                System.out.print("Qual a idade? ");
                idade = entrada.nextInt();
                System.out.println("Qual a cor do Cabelo? ");
                System.out.println("----------------------");
                System.out.println("[1] Preto");
                System.out.println("[2] Castanho");
                System.out.println("[3] Loiro");
                System.out.println("[4] Ruivo");
                cab = entrada.nextInt();
                System.out.print("Quer continuar? [S/N] ");
                resp = entrada.next().charAt(0);
                if((sexo == 'M' || sexo == 'm') && cab == 2 && idade >= idadeH) {
                    totalH = totalH + 1;
                }                   
               
                if((sexo == 'F' || sexo == 'f') && cab == 3 && idade >= idadeMI && idade <= idadeMF) {
                    totalM = totalM + 1;
                }                     
            } while(resp == 'S' || resp == 's');
              entrada.close();  
            System.out.println("----------------------");
            System.out.println("    RESULTADO FINAL   ");
            System.out.println("----------------------");
            System.out.println("Total de homens com mais de " +  idadeH +  " anos e cabelos " +  cabPadraoH +  " " +  totalH);
            System.out.println("Total de mulheres entre " +  idadeMI +  " e " +  idadeMF +  " anos e cabelos " +  cabPadraoM +  " " +  totalM);
    }
}
