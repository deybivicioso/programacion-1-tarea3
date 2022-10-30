package familiaSanchez;

import familiaMartinez.abueloMartinez;
import familiaMartinez.familiaMartinez;
public class abuelaSanchez extends abueloMartinez implements familiaMartinez {
    public abuelaSanchez(){
    super("veredilia", "sanchez", 72);
    }
    @Override
    public String nombre(){
     return "mi nombre es "+this.nombre;
     }

     @Override
     public String apellido(){
         System.out.println("llevo el apellido de mi esposo y de toda mi familia ");
         return "el apellido de mi familia es "+this.apellido;
     }

     @Override
     public int edad(){
         System.out.print("soy una mujer vieja y con achaques mi edad es ");
         return this.edad;
     }

     @Override
     public String posecion(){
         return "mi mayor posesion es la familia de mi amado esposo, mis hijos y mis nietos ";
     }  
}
