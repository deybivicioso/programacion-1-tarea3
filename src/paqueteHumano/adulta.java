package paqueteHumano;
public class adulta extends humanos{
    public adulta (){
        super("elder", "sanchez", 25);
    }
   public String nombre(){
    return "mi nombre es "+ this.nombre;
   }
   public  String stadoCivil(){
    return "estoy casada con mi esposo pero no es el Sr.sanchez";
   }
    public int edad(){
        System.out.print("cariño, mi edad es ");
        return this.edad;
    }
    public String posecion (){
        return "mi posecion es un anillo";
    }
    
}
