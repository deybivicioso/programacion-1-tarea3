package paqueteHumano;
public class mujer extends humanos {
    public mujer() {
        super("maria", "sanchez", 32);
    }

    @Override
    public String nombre() {
        return "yo soy la Sra. " + this.nombre;
    }

    @Override
    public String stadoCivil() {
        return "estoy casado con jose sanchez";
    }

    @Override
    public int edad() {
        System.out.println("mi edad es ");
        return this.edad;
    }

    @Override
    public String posecion() {
        return "mi mas valiosa posesion es el collar que me regalo mi esposo ";
    }

}
