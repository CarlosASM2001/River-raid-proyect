

package ElementosDelJuego;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


/**Clase Sonido*/
public class Sonido {
    
    private Clip sonidoDisparo;
    private Clip sonidoNave;
    private Clip Explo_barco;
    private Clip Explo_avioneta;
    
    private Clip motor;
    
    /** Constructor*/
    public Sonido(){
        try {
            motor= AudioSystem.getClip();
            Explo_barco = AudioSystem.getClip();
            Explo_barco.open(AudioSystem.getAudioInputStream(new File("src/Sonido/explo-barco.wav")));
            Explo_avioneta = AudioSystem.getClip();
            Explo_avioneta.open(AudioSystem.getAudioInputStream(new File("src/Sonido/explo-avioneta.wav")));
            sonidoDisparo = AudioSystem.getClip();
            sonidoDisparo.open(AudioSystem.getAudioInputStream(new File("src/Sonido/flaunch.wav")));
            
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException ex) {
            System.out.println("error cargando el sonido");
        }
       
    }
    /** Metodo sonido de disparo*/
    public void disparo()
    {
        sonidoDisparo.setMicrosecondPosition(800);
        
        sonidoDisparo.start();
    }
    /** sonido explosion del barco*/
     public void explo_barco()
    {
        Explo_barco.setMicrosecondPosition(800);
        Explo_barco.start();
    }
     /** sonido  explosion de avion*/
      public void explo_avioneta()
    {
        Explo_avioneta.setMicrosecondPosition(800);
        Explo_avioneta.start();
    }

   
    /**sonido del motor nave*/
    public void mOtor()
    {
        try {
            motor.open(AudioSystem.getAudioInputStream(new File("src/Sonido/plane.wav")));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Sonido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sonido.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Sonido.class.getName()).log(Level.SEVERE, null, ex);
        }
         motor.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void detenermOtor()
    {
       
         motor.close();
    }
    
  
}
