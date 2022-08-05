
package ElementosDelJuego;

import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;


/**Clase Tanque*/
public class Tanque {
    private Point coord;
    private Rectangle ubicacion;
    private final int ancho=36;
    private final int alto=63;
    private Image look;
    private Boolean ini=false;
    private int borrar;
    
    /**constructor por defecto que se encarga de inicializar el objeto de tipo Rectangle para las colisiones y cargar la imagen del tanque*/
    public Tanque(){
        borrar=0;
        ini = false;
        ubicacion = new Rectangle(0,-150,ancho,alto);
        try {
            look= ImageIO.read(new File("src/Combustible/Combustible.png"));
        } catch (IOException ex) {
            System.out.println("error la imagen de la nave no se encuentra en la ruta por defecto");
        }
    }
    /**metodo que retorna Rectangle para las colisiones*/
    public Rectangle getUbicacion(){
        return this.ubicacion;
    }
   /**metodo que retorna la posicion de los tanques en x*/
    public int getPosx() {
        return ubicacion.x;
    }
    /**metodo que retorna la posicion de los tanques en y*/
    public int getPosy() {
        return ubicacion.y;
    }
    
    /**metodo que  retorna la imagen que representa el tanque*/
    public Image getImagen() {
        return look;
    }
    /**metodo imagen explocion*/
    public void explotar(){
        try {
           look = ImageIO.read(new File("src/Explosion/Explosion.png"));
        } catch (IOException ex) {
            System.out.println("error la imagen de la nave no se encuentra en la ruta por defecto");
        }
        ini=true;
    }
     /**metodo para simular que se mueven con el mapa*/
    public void desplazar(int d){
        this.ubicacion.y+=d;
        if(ini)
        borrar++;
    }
    /**metodo que retorna una variable de tipo numero, permite cargar el sprite de explosion*/
    public int getBorrar(){
        return borrar;
    }
    /**metodo que genera un tanque dentro del mapa establecido*/
    public void generar(ArrayList<Rectangle> izquierdo, ArrayList<Rectangle> derecho,ArrayList<Rectangle> medio){

         Random a = new Random();
        ubicacion.x=a.nextInt(900)+100;
        if(ubicacion.x<550){
            for(Rectangle rec :izquierdo){
                
            if(ubicacion.intersects(rec))
            {  
             ubicacion.x = rec.width;
             break;
            }
            }
            for(Rectangle rec :medio){
                
            if(ubicacion.intersects(rec))
            {  
                 int aux = ubicacion.x-rec.x;
                 ubicacion.x = ubicacion.x-ubicacion.width-aux; 
                 break;
            }
            
            }
        }
        else
        {
            for(Rectangle rec :derecho){
                
                if(ubicacion.intersects(rec))
                 {  
                 int aux = ubicacion.x-rec.x;
                 ubicacion.x = ubicacion.x-ubicacion.width-aux; 
                 break;
                 }
            }
            
            for(Rectangle rec :medio){
                
                 if(ubicacion.intersects(rec))
                 {  
                 ubicacion.x = rec.width+ rec.x;
                 break;
                 }
            
            }

        }
  
    } 
    
}
