
package ElementosDelJuego;

import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/**Clase responsable de cargar el puente  dentro del gamestate*/
public class Puente {
    
    private Image look;
    private Rectangle ubicacion;
    private final int ancho=235;
    private final int alto=160;
    private Boolean ini = false;
    private int borrar =0;
    
    /**constructor por defecto */
    public Puente(int x , int y){
        ubicacion=new Rectangle(x,y,ancho,alto);
        try {
            look = ImageIO.read(new File("src/Puente/Puente.png"));
        } catch (IOException ex) {
            System.out.println("error la imagen del puente no se encuentra en la ruta por defecto");
        }
    }
    /**metodo que retorna una variable de tipo numero, permite cargar el sprite de explosion*/
    public int getBorrar()
    {
        return borrar;
    }
    /**metodo que retorna la imagen del puente */
    public Image getLook() {
        return look;
    }
    
    /**metodo que devuelve la posicion en x */
    public int getPosX(){
        return ubicacion.x;
    }
    
    /**metodo que pone el puente en su posicion al morir el avion*/
    public void resetear(int set){ 
        ubicacion.y = set;
    }
    /**metodo que retorna la posicion en y */
    public int getPosY(){
        return ubicacion.y;
    }
    /**metodo que combia la imagen del puente por el de la explosion*/
    public void explotar(){
        try {
           look = ImageIO.read(new File("src/Explosion/explo_puente.png"));
        } catch (IOException ex) {
            System.out.println("error la imagen de la nave no se encuentra en la ruta por defecto");
        }
        ini=true;
    }
    /**metodo que retorna el objeto Rectangle */
    public Rectangle getUbicacion() {
        return ubicacion;
    }
    /**metodo que mueve el puente a la misma velocidad que se mueve el mapa*/
    public void AumentarPosicion(int set){
        ubicacion.y+=set;
        if(ini)
        borrar++;
    }

    
    
    
}
