package familiaSanchez;

import familiaMartinez.abueloMartinez;
import familiaMartinez.familiaMartinez;

public class tioSanchez extends abueloMartinez implements familiaMartinez {
    public tioSanchez() {
        super("sandro", "sanchez", 42);
    }

    @Override
    public String nombre() {
        return "mi nombre es " + this.nombre;
    }

    @Override
    public String apellido() {
        System.out.println("mi hermano, mi abuelo y yo compartimos el mismo apellido");
        return "el apellido es " + this.apellido;
    }

    @Override
    public int edad() {
        System.out.print("ahora mismo tengo ");
        return this.edad;
    }

    @Override
    public String posecion() {
        return "mi mayos posesion es camaro del 83 mi padre";
    }
}
