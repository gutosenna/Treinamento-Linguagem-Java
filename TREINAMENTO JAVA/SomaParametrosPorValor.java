public class SomaParametrosPorValor {
    public static void soma(int A, int B) {
        A = A + 1;
        B = B + 2;
        System.out.println("Valor de A = " + A);
        System.out.println("Valor de B = " + B);
        System.out.println("Soma A + B = " + (A+B));
    } 
    public static void main(String[] args) {
        int X, Y;
        
        X = 4;
        Y = 8;
        soma(X,Y);
        System.out.println("Valor de X = " + X);
        System.out.println("Valor de Y = " + Y);
        System.out.println("Soma X + Y = " + (X+Y));
    }
}
