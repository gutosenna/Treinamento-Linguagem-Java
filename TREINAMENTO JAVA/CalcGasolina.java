import java.util.Scanner;

public class CalcGasolina {
    public static void main(String[] args) {
        //Variáveis
        float alcool, gasolina, preco;
        final float porcentagem = 0.7f;
        //Objetos
        Scanner teclado = new Scanner(System.in);
        
        //Entradas
        System.out.println("Alcool x Gasolina");
        System.out.print("Digite o valor do alcool: ");
        alcool = teclado.nextFloat();
        System.out.print("Digite o valor da gasolina: ");
        gasolina = teclado.nextFloat();
        //Processamento e saida
        preco = gasolina * porcentagem;        
        if(alcool < preco) {
            System.out.println("Melhor comprar alcool");
        } else {
            System.out.println("Melhor comprar gasolina");
        }
        teclado.close();
    }
}
