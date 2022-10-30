package paqueteHumano;
public class niño extends humanos{
    public niño (){
        super("jose", "martinez", 8);
    }
    public String nombre(){
        return "mi nombre es"+ this.nombre;
    }
   public String stadoCivil(){
    return "estoy soltero porque soy un niño";
   }
   public int edad(){
    System.out.print("mi edad ");
    return this.edad;

   }
   public String posecion (){
    return "tengo un juguete y puedo heredar el vehiculo de mi papa";
   }
}

    

