package familiaMartinez;
public abstract class  abueloMartinez implements familiaMartinez{
    protected String nombre;
    protected String apellido;
    protected int edad;
    public abueloMartinez(String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }  
}
