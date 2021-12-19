package validacaocpf;

import java.util.Scanner;
            // importanto a classe "ValidadorCPF" do pacote "meuPacote"           
        
        public class VerificadorCPF {

          public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            String CPF;

            System.out.printf("Informe um CPF: ");
            CPF = ler.next();
            ler.close();
            System.out.printf("\nResultado: ");
                // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
            if (ValidadorCPF.isCPF(CPF) == true)
               System.out.printf("%s\n", ValidadorCPF.imprimeCPF(CPF));
            else System.out.printf("Erro, CPF invalido !!!\n");
            }
        }
