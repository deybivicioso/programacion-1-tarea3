package familiaSanchez;

import familiaMartinez.abueloMartinez;
import familiaMartinez.familiaMartinez;

public class madreSanchez extends abueloMartinez implements familiaMartinez {
    public madreSanchez(){
        super("leona", "sanchez", 36);
    }
    @Override
    public String nombre(){
     return "mi nombre es "+this.nombre;
     }

     @Override
     public String apellido(){
         System.out.println("amo a mi esposo y ");
         return "el apellido de mi exposo es "+this.apellido;
     }

     @Override
     public int edad(){
         System.out.print("mi edad es de ");
         return this.edad;
     }

     @Override
     public String posecion(){
         return "tengo un vehiculo que aprecio mucho";
     } 
}
