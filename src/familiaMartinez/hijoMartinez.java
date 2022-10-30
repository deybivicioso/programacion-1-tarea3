package familiaMartinez;

public class hijoMartinez extends abueloMartinez {
    public hijoMartinez(){
    super("estephan", "martinez", 14);
    }
    @Override
    public String nombre(){
     return "mi nombre es "+this.nombre;
     }

     @Override
     public String apellido(){
         System.out.println("llevo el apellido de mi padre");
         return "el apellido de mi padre es "+this.apellido;
     }

     @Override
     public int edad(){
         System.out.print("soy un joven vigoroso mi edad es de ");
         return this.edad;
     }

     @Override
     public String posecion(){
         return "mi mayos posesion es el relojo del abuelo, el me lo lego";

     }
}
