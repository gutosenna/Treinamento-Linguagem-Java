import java.util.Scanner;

public class AnalisadorString {    
    public static void main(String[] args) {
     String n;
     int c, i;
     char result; 
   Scanner input = new Scanner(System.in);  

   System.out.print("Digite seu nome: ");
   n = input.nextLine();
   input.close();
   System.out.println("Total de letras do seu nome: " + n.length());
   System.out.println("Seu nome em maiusculas e "+ n.toUpperCase());
   System.out.println("Seu nome em minusculas e " + n.toLowerCase());
   
   i = n.length() - 1;   
   result = n.charAt(i);
   System.out.println("A primeira letra do seu nome e " + n.charAt(0));
   System.out.println("A ultima letra do seu nome e " + Character.toString(result).toUpperCase());
   System.out.println("A posicao da letra \'a\' e " + n.lastIndexOf("a"));

   
   System.out.println("Seu nome tem a letra T na posicao " + n.indexOf("t"));
   System.out.println("O codigo da letra \"A\" eh " + n.codePointAt(i));
   
        
   for (c = n.length() - 1; c >= 0; c--) {
    System.out.print(n.charAt(c)); //Escreve o nome de tras pra frente
   }
   System.out.println();     
 }
}