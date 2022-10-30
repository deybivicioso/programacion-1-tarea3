package familiaSanchez;

import familiaMartinez.abueloMartinez;
import familiaMartinez.familiaMartinez;

public class padreSanchez extends abueloMartinez implements familiaMartinez {
    public padreSanchez(){
        super("leon", "sanchez", 30);
    }
    @Override
    public String nombre(){
     return "mi nombre es "+this.nombre;
     }

     @Override
     public String apellido(){
         System.out.println("llevo el apellido de mi esposo");
         return "el apellido de mi exposo es "+this.apellido;
     }

     @Override
     public int edad(){
         System.out.print("soy una mujer joven mi edad es de ");
         return this.edad;
     }

     @Override
     public String posecion(){
         return "mi mayos posesion es el collar que me regalo mi esposo";
     }
}
