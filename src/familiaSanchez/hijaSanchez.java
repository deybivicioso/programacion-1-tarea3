package familiaSanchez;
import familiaMartinez.abueloMartinez;
import familiaMartinez.familiaMartinez;

public class hijaSanchez extends abueloMartinez implements familiaMartinez {
    public hijaSanchez(){
        super("salvatore", "sanchez", 17);
    }
    @Override
    public String nombre(){
     return "mi nombre es "+this.nombre;
     }

     @Override
     public String apellido(){
         System.out.println("llevo el apellido de mi mama y de mi padre");
         return "estoy orgulloso del apellido de mi familia "+this.apellido;
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
