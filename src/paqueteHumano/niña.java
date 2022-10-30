package paqueteHumano;
public class niña extends  humanos {
    public niña(){
        super("elena", "sanchez", 8);
    }
    public String nombre(){
        return "mi nombre es "+ this.nombre;
    }
    public String stadoCivil(){
        return "soy una niña aun no puedo estar casada";
    }
   public int edad(){
    System.out.print("mi eda es ");
    return this.edad;
   }
    public  String posecion (){
        System.out.println("mi mama me compro un juego de cocina");
        return "me gusta el collar de mi mama";
    }
    
}
