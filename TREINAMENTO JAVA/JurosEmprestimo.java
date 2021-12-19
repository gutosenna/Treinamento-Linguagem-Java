import java.util.Scanner;

public class JurosEmprestimo {
    public static void main(String[] args) {
        float emprestimo, parcelas, resultado;
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o valor do emprestimo? ");
        emprestimo = input.nextFloat();
        System.out.print("Quantas parcelas? ");
        parcelas = input.nextFloat();
        input.close();
        resultado = (emprestimo + (emprestimo*20/100))/parcelas;
        System.out.print("Vou pagar "+ parcelas +" parcelas de R$ " + resultado);
    }
}
