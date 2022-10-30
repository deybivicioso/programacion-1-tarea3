package familiaMartinez;

public class tioMartinez extends abueloMartinez {
    public tioMartinez(){
        super("emilio", "martinez", 38);
    }
    @Override
    public String nombre(){
     return "mi nombre es "+this.nombre;
     }

     @Override
     public String apellido(){         
         return "el apellido de mi abuelo es martinez ";
     }

     @Override
     public int edad(){
         System.out.print("soy una persona vieja mi edad es de ");
         return this.edad;
     }

     @Override
     public String posecion(){
         return "no me gustan las prendas";

     }

    
}
