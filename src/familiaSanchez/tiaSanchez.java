package familiaSanchez;

import familiaMartinez.abueloMartinez;
import familiaMartinez.familiaMartinez;

public class tiaSanchez extends abueloMartinez implements familiaMartinez {
    public tiaSanchez() {
        super("esvletana", "sanchez", 45);
    }

    @Override
    public String nombre() {
        return "mi nombre es " + this.nombre;
    }

    @Override
    public String apellido() {
        System.out.println("llevo el apellido de mi esposo, de su hermano y su familia");
        return "el apellido de la familia de mi exposo es " + this.apellido;
    }

    @Override
    public int edad() {
        System.out.print("soy una mujer rusa de edad ");
        return this.edad;
    }
    @Override
    public String posecion() {
        return "mi mayos posesion son mi muñeca matriosca rusa";
    }
}
