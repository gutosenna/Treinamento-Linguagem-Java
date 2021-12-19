import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        int salto, valor, contador, contador2, contador3;
        Scanner teclado = new Scanner(System.in);

        // Contar de 0 a 10 - incremento
        contador = 0;
        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }
        System.out.println("Terminei de contar");
        System.out.println();

        // Contar de 10 a 0 - decremento
        contador2 = 10;
        while(contador2 >= 0) {
            System.out.println(contador2);
            contador2--;        
        }
            
        System.out.println("Terminei de contar");
        System.out.println("");

        // Contar ate onde o usuario quiser
        contador3 = 0;
        System.out.println("Quer contar ate quanto? ");
        valor = teclado.nextInt();
        System.out.println("Qual sera o valor do salto? ");
        salto = teclado.nextInt();
        while(contador3 <= valor) {
            System.out.println(contador3);
            contador3 = contador3 + salto;        
        }        
        System.out.println("Terminei de contar");
        System.out.println("");
        teclado.close();
    }
    
}
