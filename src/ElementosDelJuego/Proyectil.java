
package ElementosDelJuego;

import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/**Clase Proycetil*/

public class Proyectil {

    private Image imagen;
    private Rectangle ubicacion;
    private final int ancho=53;
    private final int alto=128;
    private Boolean disparar;
    
    /**Contructor por defecto*/
    public Proyectil(){
        disparar=false;
        ubicacion= new Rectangle(0,0,ancho,alto);
        try {
            imagen = ImageIO.read(new File("src/Disparo/disparo.png"));
        } catch (IOException ex) {
            System.out.println("error la imagen del proyectil no se encuentra en la ruta ");
        }
    }
    
    /**metodo que retorna la imagen del proycetil*/
    public Image getlook(){
        
        return imagen;     
    }
    
    public void setDisparo(Boolean i){
     this.disparar= i;   
    }
    
    
    public Boolean getDisparo(){
        
        return disparar;
    }
    /**metodo que setea la posicion en x */
    public void setDireccionX(int i){
        this.ubicacion.x=i;
    }
    /**metodo que retorna la posicion en x */
    public  int getDireccionX(){
        return this.ubicacion.x;
    }
    
    /**metodo que setea la posicion en y */
     public void setProgresionY(int i){
        this.ubicacion.y=i;
    }
     /**metodo que retorna la posicion en y*/
     public int getProgresionY(){
        return this.ubicacion.y;
    }
     
     /**mueve y retorna la posicion del proyectil en y*/
     public int mover()
     {   this.ubicacion.y-=20;
         return this.ubicacion.y;
     }
     
     /**retorna el objeto Rectangle para las colisiones*/
     public Rectangle getUbicacion(){
         return ubicacion;
     }
    
}

