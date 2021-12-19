import java.text.DecimalFormat;
import java.util.Scanner;
class CalcHoraServico {
    public static void main(String[] args) {
        //VARIAVEIS
        double hora, remuneracao, custo, cargaHoraria;
        final double imposto = 0.3d;
        final double investimento = 0.2d;
        //OBJETOS
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        
        //ENTRADA
        System.out.println("Calculo do valor da hora de um servico");
        System.out.print("Remuneracao mensal pretendida: R$");
        remuneracao = teclado.nextDouble();
        System.out.print("Custo operacional mensal: R$");
        custo = teclado.nextDouble();
        System.out.print("Carga horaria mensal de trabalho: ");
        cargaHoraria = teclado.nextDouble();
        teclado.close();
        //PROCESSAMENTO
        hora = (remuneracao + (remuneracao * imposto) 
        + custo + (remuneracao * investimento))/ cargaHoraria;
        //SAIDA
        System.out.println("Valor da hora: R$" + formatador.format(hora));
    }
}