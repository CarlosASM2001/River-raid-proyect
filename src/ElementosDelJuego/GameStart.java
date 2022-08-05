
package ElementosDelJuego;

import States.GameState;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**Clase donde es ejecutada el gamestate*/
public class GameStart extends JFrame{
 
    private static GameStart instancia;
    
    /**constructor por defecto */
    private GameStart()
    {
        super("River Raid");

         setSize(1100,700);
         GameState e=new GameState();
         getContentPane().add(e,0);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setResizable(false);
         setLocationRelativeTo(null);
         setVisible(true);
    }
    
    /**metodo para crar una sola estancia*/
    public static GameStart instance()
    {
        if(instancia == null)
        {
            instancia = new GameStart();
        }
        return instancia;
    }
    
    /**metodo para eliminar esta pantalla*/
    public static void close_()
    {
        instance().dispose();
        instancia = null;
    }
}
