package familiaSanchez;

import familiaMartinez.abueloMartinez;
import familiaMartinez.familiaMartinez;

public class hijoSanchez extends abueloMartinez implements familiaMartinez {
    public hijoSanchez(){
        super("brendan", "sanchez", 14);
    }
    @Override
    public String nombre(){
     return "mi nombre es "+this.nombre;
     }

     @Override
     public String apellido(){
         System.out.println("llevo el apellido de mi papa y de mi papa");
         return "ellos se apellidan "+this.apellido;
     }

     @Override
     public int edad(){
         System.out.print("el proximo año tendre ");
         return this.edad++;
     }

     @Override
     public String posecion(){
         return "mi mayos posesion son mis comic";
     }  
}
