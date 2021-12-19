import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        float peso, altura, IMC;
        Scanner input = new Scanner(System.in);
    
        System.out.print("Digite o seu peso em KG: ");
        peso = input.nextFloat();
        System.out.print("Difite sua altura em M: ");
        altura = input.nextFloat();
        input.close();
        IMC = peso /(altura * altura);
        System.out.printf("Seu IMC e: %.2f\n" , IMC);
        if(IMC < 18.5) {
            System.out.print("Sua classificacao e abaixo do Peso "); 
        }          
        else if(IMC < 24.9) {
            System.out.print("Sua classificacao e saudavel (peso ideal)");
        }               
          else if(IMC < 29.9) {
            System.out.print("Sua classificacao e levemente acima do peso ");
          } 
           else if(IMC < 34.9) {
            System.out.print("Sua classificacao e sobrepeso ");
          }               
            else if(IMC < 35) {
                System.out.print("Sua classificacao e Obesidade Grau I");
            } else if (IMC < 39.9) {
                System.out.print("Sua classificacao e obesidade Grau II (Severa) ");
            } 
              else if (IMC > 40) {
                System.out.print("Sua classificacao e obesidade Grau III (Morbida) ");
            } 
            else {
                System.out.print("Classificacao inexistente ");
            }                   
        }
}
