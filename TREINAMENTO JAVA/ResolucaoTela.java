import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;



/**
 *
 * @author GutoSenna <sesenna@hotmail.com>
 */
public class ResolucaoTela {
    public static void main(String[] args) {
        // 1a forma
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    System.out.println("Largura da Tela (teste 1)= " + d.width);
    System.out.println("Altura da Tela = (teste 2)" + d.height);
        
    System.out.print("\n");
       // 2a forma 
    Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
    int lar = (int) tela.getWidth();
    int alt = (int) tela.getHeight();
    System.out.println("Sua tela tem resolu\u00E7\u00E3o (teste 3)" + lar + " x " + alt);
     //3a forma
    Toolkit screen = Toolkit.getDefaultToolkit();
    Dimension dim = screen.getScreenSize();
    System.out.print("Sua resolu\u00E7\u00E3o \u00E9 de (teste 4)"+dim.width); // \u00E7 = ç
    System.out.println(" X "+dim.height);                                      // \u00E3 = ã     
                                                                               // \u00E9 = é
    // 4a forma
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();
    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    int w = gd.getDisplayMode().getWidth();
    int h = gd.getDisplayMode().getHeight();
    System.out.println("Resolu\u00E7\u00E3o Tela(teste 5) " + width + " X " + height);
    System.out.println("Resolu\u00E7\u00E3o Tela(teste 6) " + w + " x " + h);
        
                
    }

    
}