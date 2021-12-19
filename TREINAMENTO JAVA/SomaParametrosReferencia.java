public class SomaParametrosReferencia extends Referencia {

    public SomaParametrosReferencia() {
        Referencia n = new Referencia();
        Referencia c = new Referencia();
        soma(n,c);
    }
    public static void main(String[] args) {        
        new SomaParametrosReferencia();          
         
        System.out.println("Valor de X = " + x);
        System.out.println("Valor de Y = " + y);
        System.out.println("Soma X + Y = " + (x+y));
    }
    public void soma(Referencia a, Referencia b) {
        Referencia.x++;
        Referencia.y+= 2;
        System.out.println("Valor de A = " + Referencia.x);
        System.out.println("Valor de B = " + Referencia.y);
        System.out.println("Soma A + B = " + (Referencia.x +Referencia.y));
    } 
}

