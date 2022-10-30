package paqueteHumano;
public class adolescente extends humanos{
    public adolescente (){
        super("matias", "martinez", 0);
    }
    public String nombre(){
        return "mi nombre es "+ this.nombre;
    }    
   public String stadoCivil(){
    return"estoy soltero";

   }
   public int edad(){
    return this.edad;

   }
   public  String posecion (){
    return "mi posicion es un reloj y mi padre me heredara su vehiculo";
   }
}

