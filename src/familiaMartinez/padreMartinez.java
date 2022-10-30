package familiaMartinez;
public class padreMartinez extends abueloMartinez {
    public padreMartinez(){
        super("josepn", "martinez", 40);
    }
    @Override
    public String nombre(){

        return "mi nombre es "+ this.nombre +" y yo heredo de mi abuelo";

    }
    @Override
   public String apellido(){
    return "mi apellido es "+this.apellido;
    }
    @Override
    public int edad(){
        System.out.print("mi edad es ");
        return this.edad;
    }
    public String posecion(){
        return "mi mas valiosa posesion es una herencia de mi abuelo";
    }
    
}
