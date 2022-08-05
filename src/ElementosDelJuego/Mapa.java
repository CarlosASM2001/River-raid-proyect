package ElementosDelJuego;


import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**clase con todas las varibles conrespondientes a al mapa y el movimiento */
public final class Mapa {

    private Image segmento;
    private ArrayList <Rectangle> colisionDerecha;
    private ArrayList <Rectangle> colisionIzquierda;
    private ArrayList <Rectangle> colisionMedio;
    private int segmentoActual;
    private int posicionY;
    private int movimiento;

    /**constructor por defecto que carga la imagen del mapa he inicializa todos los rectangulos para las colisiones*/
    public Mapa() {
        try {
            segmento = ImageIO.read(new File("src/Mapa/MapaFinalV3.png"));
        } catch (IOException ex) {
            System.out.println("la imagen del mapa no se encuentra");
        }
        posicionY =-29400;
        movimiento =2;
        colisionDerecha = new ArrayList<>();
        colisionIzquierda = new ArrayList<>();
        colisionMedio = new ArrayList<>();
        //cargando rectangulos de la derecha
        Rectangle dere;
        dere = new Rectangle(1100 - 360, -450, 360, 1050);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 130, -1440, 130, 990);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 360, -1855, 360, 415);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 134, -2485, 134, 622);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 360, -3030, 360, 545);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 134, -5830, 134, 2800);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 432, -6232, 432, 402);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 180, -7274, 180, 1042);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 90, -8479, 90, 1205);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 360, -8989, 360, 510);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 459, -10615, 459, 1626);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 147, -12163, 147, 1548);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 435, -13902, 435, 1739);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 267, -14880, 267, 978);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 432, -15403, 432, 523);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 360, -16453, 360, 1050);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 130, -17443, 130, 990);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 360, -17858, 360, 415);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 134, -18480, 134, 622);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 360, -19025, 360, 545);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 134, -21825, 134, 2800);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 432, -22227, 432, 402);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 180, -23277, 180, 1042);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 90, -24487, 90, 1210);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 360, -24997, 360, 510);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 459, -26623, 459, 1626);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 147, -28171, 147, 1548);
        colisionDerecha.add(dere);
        dere = new Rectangle(1100 - 435, -29910, 435, 1739);
        colisionDerecha.add(dere);
    
     
      //cargando rectangulos de la izquierda
        Rectangle izq;
        izq = new Rectangle(0, -450, 360, 1050);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -1440, 130, 990);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -1855, 360, 415);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -2485, 134, 622);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -3030, 360, 545);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -5830, 134, 2800);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -6232, 432, 402);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -7274, 180, 1042);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -8479, 90, 1205);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -8989, 360, 510);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -10615, 459, 1626);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -12163, 147, 1548);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -13902, 435, 1739);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -14880, 267, 978);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -15403, 432, 523);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -16453, 360, 1050);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -17443, 130, 990);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -17858, 360, 415);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -18480, 134, 622);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -19025, 360, 545);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -21825, 134, 2800);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -22227, 432, 402);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -29400 + 6123, 180, 1042);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -29400 + 4913, 90, 1210);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -29400 + 4403, 360, 510);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -29400 + 2777, 459, 1626);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -29400 + 1229, 147, 1548);
        colisionIzquierda.add(izq);
        izq = new Rectangle(0, -29400 - 510, 435, 1739);
        colisionIzquierda.add(izq);
      
       //cargando rectangulos del medio
        Rectangle medio;
        medio = new Rectangle(361, -5450, 378, 1917);
        colisionMedio.add(medio);
        medio = new Rectangle(361, -8172, 378, 455);
        colisionMedio.add(medio);
        medio = new Rectangle(361, -7720, 72, 412);
        colisionMedio.add(medio);
        medio = new Rectangle(662, -7720, 72, 412);
        colisionMedio.add(medio);
        medio = new Rectangle(433, -14614, 228, 386);
        colisionMedio.add(medio);
        medio = new Rectangle(361, -21450, 378, 1917);
        colisionMedio.add(medio);
        medio = new Rectangle(361, -24175, 378, 455);
        colisionMedio.add(medio);
        medio = new Rectangle(361, -23720, 72, 412);
        colisionMedio.add(medio);
        medio = new Rectangle(661, -23720, 72, 412);
        colisionMedio.add(medio);
             
             
        
    }

    /**retorna la imagen del mapa*/
    public Image getMapa() {
        return segmento;
    
    }
    
    
    public int getPosicionY() {
        return posicionY;
    }
    public int getrecPosY(int i) {
        return colisionMedio.get(i).y;
    }
    public int getPosX(int i) {
        return     colisionMedio.get(i).x ;
    }
     public int getancho(int i) {
        return     colisionMedio.get(i).width ;
    }
      public int getalto(int i) {
        return     colisionMedio.get(i).height ;
    }

    
    /**metodo que actualiza las posiciones de los rectangulos y del mapa para cuando el jugador pierda una vida inicie desde el lugar correpto*/
    public void actualizarPos(int posY){
        this.posicionY = posY;
        colisionIzquierda.clear();
        colisionDerecha.clear();
        colisionMedio.clear();
        
        Rectangle iz;
             iz=new Rectangle(0,posY+28950,360,1050);
       /*1*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+27960,130,990);
       /*2*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+27545,360,415);
       /*3*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+26915,134,622);
       /*4*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+26370,360,545);
       /*5*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+23570,134,2800);
       /*6*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+23168,432,402);
       /*7*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+22126,180,1042);
       /*8*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+20921,90,1205);
       /*9*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+20411,360,510);
       /*10*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+18785,459,1626);
       /*11*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+17237,147,1548);
       /*12*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+15498,435,1739);
       /*13*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+14520,267,978);
       /*14*/ colisionIzquierda.add(iz);
            iz=new Rectangle(0,posY+13997,432,523);
       /*15*/ colisionIzquierda.add(iz);
            iz=new Rectangle(0,posY+12947,360,1050);
       /*16*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+11957,130,990);
       /*17*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+11542,360,415);
       /*18*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+10920,134,622);
       /*19*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+10375,360,545);
       /*20*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+7575,134,2800);
       /*21*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+7173,432,402);
       /*22*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+6123,180,1042);
       /*23*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+4913,90,1210);
       /*24*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+4403,360,510);
       /*25*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+2777,459,1626);
       /*26*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY+1229,147,1548);
       /*27*/ colisionIzquierda.add(iz);
             iz=new Rectangle(0,posY-510,435,1739);
       /*28*/ colisionIzquierda.add(iz);
       
       Rectangle der;
             der=new Rectangle(1100-360,posY+28950,360,1050);
       /*1*/ colisionDerecha.add(der);
             der=new Rectangle(1100-130,posY+27960,130,990);
       /*2*/ colisionDerecha.add(der);
             der=new Rectangle(1100-360,posY+27545,360,415);
       /*3*/ colisionDerecha.add(der);
             der=new Rectangle(1100-134,posY+26915,134,622);
       /*4*/ colisionDerecha.add(der);
             der=new Rectangle(1100-360,posY+26370,360,545);
       /*5*/ colisionDerecha.add(der);
             der=new Rectangle(1100-134,posY+23570,134,2800);
       /*6*/ colisionDerecha.add(der);
             der=new Rectangle(1100-432,posY+23168,432,402);
       /*7*/ colisionDerecha.add(der);
             der=new Rectangle(1100-180,posY+22126,180,1042);
       /*8*/ colisionDerecha.add(der);
             der=new Rectangle(1100-90,posY+20921,90,1205);
       /*9*/ colisionDerecha.add(der);
             der=new Rectangle(1100-360,posY+20411,360,510);
       /*10*/ colisionDerecha.add(der);
             der=new Rectangle(1100-459,posY+18785,459,1626);
       /*11*/ colisionDerecha.add(der);
             der=new Rectangle(1100-147,posY+17237,147,1548);
       /*12*/colisionDerecha.add(der);
             der=new Rectangle(1100-435,posY+15498,435,1739);
       /*13*/ colisionDerecha.add(der);
             der=new Rectangle(1100-267,posY+14520,267,978);
       /*14*/ colisionDerecha.add(der);
            der=new Rectangle(1100-432,posY+13997,432,523);
       /*15*/colisionDerecha.add(der);
            der=new Rectangle(1100-360,posY+12947,360,1050);
       /*16*/ colisionDerecha.add(der);
             der=new Rectangle(1100-130,posY+11957,130,990);
       /*17*/ colisionDerecha.add(der);
             der=new Rectangle(1100-360,posY+11542,360,415);
       /*18*/colisionDerecha.add(der);
             der=new Rectangle(1100-134,posY+10920,134,622);
       /*19*/ colisionDerecha.add(der);
             der=new Rectangle(1100-360,posY+10375,360,545);
       /*20*/ colisionDerecha.add(der);
             der=new Rectangle(1100-134,posY+7575,134,2800);
       /*21*/colisionDerecha.add(der);
             der=new Rectangle(1100-432,posY+7173,432,402);
       /*22*/ colisionDerecha.add(der);
             der=new Rectangle(1100-180,posY+6123,180,1042);
       /*23*/colisionDerecha.add(der);
             der=new Rectangle(1100-90,posY+4913,90,1210);
       /*24*/colisionDerecha.add(der);
             der=new Rectangle(1100-360,posY+4403,360,510);
       /*25*/colisionDerecha.add(der);
             der=new Rectangle(1100-459,posY+2777,459,1626);
       /*26*/colisionDerecha.add(der);
             der=new Rectangle(1100-147,posY+1229,147,1548);
       /*27*/colisionDerecha.add(der);
             der=new Rectangle(1100-435,posY-510,435,1739);
       /*28*/ colisionDerecha.add(der);
      
       Rectangle me;
             me = new Rectangle(361,posY+23950,378,1917);
             colisionMedio.add(me);
             me = new Rectangle(361,posY+21228,378,455);
             colisionMedio.add(me);
             me = new Rectangle(361,posY+21680,72,412);
             colisionMedio.add(me);
             me = new Rectangle(662,posY+21680,72,412);
             colisionMedio.add(me);
             me = new Rectangle(433,posY+14686,228,386);
             colisionMedio.add(me);
             me = new Rectangle(361,posY+7950,378,1917);
             colisionMedio.add(me);
             me = new Rectangle(361,posY+5225,378,455);
             colisionMedio.add(me);
             me = new Rectangle(361,posY+5680,72,412);
             colisionMedio.add(me);
             me = new Rectangle(661,posY+5680,72,412);
             colisionMedio.add(me);
    }
    
    /**metodo que mueve los rectangulos cada vez que es llamado*/
    public void aumentarPosY(int set) {
        this.posicionY += set;
        
        for(Rectangle rec : colisionDerecha)
        rec.y+=set;
        
        for(Rectangle rec : colisionIzquierda)
        rec.y+=set;
        
        for(Rectangle rec : colisionMedio)
        rec.y+=set;
    }
    
    /**metodo que mueve el mapa*/
    public void setMovimiento(int a){
        this.movimiento = a;
    }
    
    /**metodo que retorna */
    public int getMovimiento(){
       return this.movimiento;      
    }
    
    /**metodo que retorna un ArrayList con las colisiones de la derecha*/
    public ArrayList<Rectangle> getPosDerecha(){
        return colisionDerecha;
    }
    /**metodo que retorna un ArrayList con las colisiones de la izquierda*/
    public ArrayList<Rectangle> getPosIzquierda(){
        return colisionIzquierda;
    }
    /**metodo que retorna un ArrayList con las colisiones del medio*/
    public ArrayList<Rectangle> getPosMedia(){
        return colisionMedio;
    }
   
    
    

}
