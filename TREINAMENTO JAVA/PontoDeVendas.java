import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class PontoDeVendas {
    public static void main(String[] args) {
        double tot, desc, totDesc, valorPago, troco, valorPagoDesc;
        Scanner input = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        Random total = new Random();
        tot = total.nextInt(1000);  
              
        
        System.out.println("Valor total da compra: R$"  + formatador.format(tot));        
        System.out.print("Valor do desconto: ");
        desc = input.nextDouble();
        totDesc = tot - (tot * desc)/100;;
        System.out.println("Total de desconto " +desc+"%  = R$" + formatador.format(tot - totDesc));
        System.out.println("Valor da compra atual: R$" + formatador.format(totDesc));
        System.out.print("Deseja pagar qual valor: R$");
        valorPago = input.nextDouble();
        valorPagoDesc = (tot - totDesc * (-1)) - valorPago ;
        troco = tot -  valorPagoDesc;
        input.close();
        System.out.println("Voce pagou R$" + formatador.format(valorPagoDesc)
        + " com uma nota de R$" + formatador.format(valorPago));
        System.out.println("Troco: R$" + formatador.format(troco));

    }
}
