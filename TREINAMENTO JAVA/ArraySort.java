import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int idx[] = {2, 1, 9, 6, 4};

        System.out.println("Valores de um array para ORDENAR/CLASSIFICAR");
        for(int valor:idx) {
            System.out.print(valor + "\t");
        }
        Arrays.sort(idx);
        System.out.println("\n");

        System.out.println("Valores de um array ORDENADO/CLASSIFICADO");
        for(int valor:idx) {
            System.out.print(valor + "\t");
        }        
        System.out.println("\n");
    }
}
