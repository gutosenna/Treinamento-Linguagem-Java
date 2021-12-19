public class WhileExemplo2 {
    public static void main (String[] args ) {
        int num = 1;
        while(num<=10) {
            System.out.println("4 x " + num + " = " +4*num);
            num++;
        }
           // cada linha de comando da estrutura while em java é limitada por ponto-e-vírgula ;
           // o agrupamento da estrutura while em java é limitado por chaves {...} 
           // variável num inicializada com 1 e incrementada de 1 num++ enquanto num <=10
           // apresentaçãp da mensagem concatenada "4x" com a variável num e o sinal "="
           // Execução da multiplicação da tabuada do 4 com o valor acumulador em num
    }
}