package familiaMartinez;
import javax.sound.midi.Soundbank;

public class madreMartinez extends abueloMartinez {
    public madreMartinez(){
        super("miranda", "martinez", 35);
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
