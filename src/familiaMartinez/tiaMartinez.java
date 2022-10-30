package familiaMartinez;

public class tiaMartinez extends abueloMartinez {
    public tiaMartinez(){
        super("beatrix", "martinez", 38);
    }

    @Override
    public String nombre(){
     return "mi nombre es "+this.nombre;
     }

     @Override
     public String apellido(){
         return "mi apellido de mi es "+this.apellido;
     }

     @Override
     public int edad(){
         System.out.print("mi edad es de ");
         return this.edad;
     }

     @Override
     public String posecion(){
         return "tengo muchas posesiones";

     }
}
