package paqueteHumano;
public class adolescenteM extends  humanos {
    public adolescenteM() {
        super("katherine", "sanchez", 16);
    }

    @Override
    public String nombre() {
        System.out.println("mi nombre es " + this.nombre);
        return "mi apellido es" + this.apellido;
    }

    @Override
    public String stadoCivil() {
        System.out.print("aun estoy soltera ");
        return "¿quieres ser mi novio?";
    }

    @Override
    public int edad() {
        System.out.println("mi edad es ");
        return this.edad;
    }

    @Override
    public String posecion() {
        return "mi mama me va a heredar su collar";
    }

}
