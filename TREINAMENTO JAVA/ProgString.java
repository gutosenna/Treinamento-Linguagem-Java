public class ProgString {
    public static void main(String[] args) {
        System.out.println("\n*** Recomenda-se nao acentuar as palavras! ***");
        System.out.println("\n===============================================================");
        String v1 = "Sistema";
        String v2 = new String("sistema");

        // equals
        System.out.println("Exemplo COM o metodo de comparacao: equals");
        if (v1.equals(v2)) {
            System.out.println("Variaveis Identicas => " + " v1: " + v1 + " v2: " + v2);
        } else {
            System.out.println("Variaveis Diferentes => " + " v1: " + v1 + " v2: " + v2);
        }
        System.out.println("\n===============================================================");

        // equalsIgnoreCase
        System.out.println("Exemplo SEM o metodo de comparacao: equalsIgnoreCase");
        if (v1.equalsIgnoreCase(v2)) {
            System.out.println("Variaveis Identicas => " + " v1: " + v1 + " v2: " + v2);
        } else {
            System.out.println("Variaveis Diferentes => " + " v1: " + v1 + " v2: " + v2);
        }
        System.out.println("\n===============================================================");

        // Alguns metodos
        // indexOf, charAt, substring
        System.out.println("Exemplos com metodos: indexOf, substring, charAt");
        String frase = "Desenvolvimento de Sistemas";
        System.out.println("\nFrase-Exemplo => Desenvolvimento de Sistemas");
        System.out.println("\ncharAt => Posicao da fonte <v> na Frase-Exemplo (0 a 26 e com os espacos): " + frase.charAt(5));
        System.out.println("\nindexOf => Posicionamento da letra <a> na Frase-Exemplo (0 a 26 e com os espacos): " + frase.indexOf("a"));
        System.out.println("\nsubstring => Identificacao dos 4 primeiros caracteres: " + frase.substring(0,3));
        System.out.println("\n===============================================================");
        String titulo1 = "Desenvolvimento ", titulo2 = "de Sistemas ";
        String cursoCompleto = titulo1.concat(titulo2);
        System.out.println("\ntitulo1: " + titulo1);
        System.out.println("titulo 2: " + titulo2);
        System.out.println("Exemplo Concatenado => titulo 1 + titulo 2 = " + cursoCompleto);
    }
}
