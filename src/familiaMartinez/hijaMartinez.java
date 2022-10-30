package familiaMartinez;

public class hijaMartinez extends abueloMartinez{
    public hijaMartinez(){
        super("emely", "martinez", 10);
    }
    @Override
    public String nombre(){
     return "mi nombre es "+this.nombre;
     }

     @Override
     public String apellido(){
         System.out.println("llevo el apellido de mi papa");
         return "el apellido de mi papa es "+this.apellido;
     }

     @Override
     public int edad(){
         System.out.print("soy una niña pequeña, mi edad es de ");
         return this.edad;
     }

     @Override
     public String posecion(){
         return "mi mayos posesion es el juego de cocina que me compro mi abuelo";
     }
}
