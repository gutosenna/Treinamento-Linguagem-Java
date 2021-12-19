import java.util.Scanner;

public class Livro {
    public static void main(String[] args) {
        int codigoDoLivro; //{Nome da Variável: Tipo da variável}
        String titulo, autor, editora; //{declaração de variáveis, todas como literal}
        Scanner input = new Scanner(System.in);

        codigoDoLivro = 0;
        //LEIA: Entrada de DADOS
        //ESCREVA: Saída de DADOS
        System.out.println("Este \u00E9 um programa em pseudoc\u00F3digo que exibe na tela os dados de um livro");
        System.out.println();
        System.out.print("Digite o c\u00F3digo do livro ");
        codigoDoLivro = input.nextInt();
        input.nextLine();
        System.out.print("Digite o t\u00EDtulo do livro ");
        titulo = input.nextLine();
        System.out.print("Digite o autor do livro ");
        autor = input.nextLine();
        System.out.print("Digite a editora do livro ");
        editora = input.nextLine();
        input.close();
        System.out.print(" O c\u00F3digo do livro \u00E9  "+ codigoDoLivro);
        System.out.print(" O t\u00EDtulo do livro \u00E9  "+ titulo);
        System.out.print(" O autor do livro \u00E9  "+ autor);
        System.out.print(" A Editora do livro \u00E9  "+ editora);
    }
}
