package familiaSanchez;
import familiaMartinez.abueloMartinez;
import familiaMartinez.familiaMartinez;
public class abueloSanchez extends abueloMartinez implements familiaMartinez {
    public abueloSanchez() {
        super("elaian", "sanchez", 79);
    }

    @Override
    public String nombre() {
        return "mi nombre es " + this.nombre;
    }

    @Override
    public String apellido() {
        System.out.println("soy el cabeza de la familia sanchez");
        return "el apellido de mi casa es  " + this.apellido;
    }

    @Override
    public int edad() {
        System.out.print("soy el mayor de la casa, mi edad es de ");
        return this.edad;
    }

    @Override
    public String posecion() {
        return "mi mayos posesion es mi familia";
    }
}
