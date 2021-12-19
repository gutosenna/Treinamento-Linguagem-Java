package aulainterface;
public class ControleRemoto implements Controlador{
    //ATRIBUTOS
    private int volume;
    private boolean ligado, tocando;   
    
    //METODOS ESPECIAIS

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean isLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean isTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }    
    //METODOS ABSTRATOS
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        if(this.isLigado()) {
            System.out.println("------- MENU -------");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.isTocando());
            System.out.print("Volume: " + this.getVolume() + " -> ");
            for(int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
        } else {
            System.out.println("Impossível ligar MENU");
        }        
        System.out.println("");
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando MENU...");
    }
    @Override
    public void maisVolume() {
        if(this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossivel aumentar volume.");
        }        
    }
    @Override
    public void menosVolume() {
        if(this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir volume.");
        }        
    }
    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir.");
        }        
    }
    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar.");
        }        
    }    
}

