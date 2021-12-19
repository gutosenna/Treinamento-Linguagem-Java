import java.util.Scanner;

public class MelhorAluno {
    public static void main(String[] args) {
        byte n, aluno;
        float nota, notaMaior;
        String nome, alunoMelhor;
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("Escola Santa Paciencia");
        System.out.println("----------------------");
        System.out.print("Quantos alunos a turma tem? ");
        n = scanner.nextByte();
        scanner.nextLine();
        System.out.println("----------------------");
        aluno = 1;
        notaMaior = 0;
        alunoMelhor = " ";
        while(aluno <= n) {
            System.out.println("ALUNO "+ aluno);
            System.out.print("Nome do aluno: ");
            nome = scanner.nextLine();
            System.out.print("Nota de "+ nome + ": ");
            nota = scanner.nextFloat();
            scanner.nextLine();            
            System.out.println("----------------------");
            aluno++;
            if(nota > notaMaior) {
                notaMaior = nota;
                alunoMelhor = nome;
            } 
        } scanner.close();           
        System.out.printf("O melhor aproveitamento foi de %s com a nota: %.1f", alunoMelhor, notaMaior);
    }
}
