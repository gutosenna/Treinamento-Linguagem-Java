package aulainterface;
public class AulaInterface {
    
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.ligarMudo();
        c.desligarMudo();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}