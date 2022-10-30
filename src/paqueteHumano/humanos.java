package paqueteHumano;

public abstract class humanos {
   String nombre, apellido;
   int edad;

   public humanos(String nombre, String apellido, int edad) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.edad = edad;
   }

   public abstract String nombre();

   public abstract String stadoCivil();

   public abstract int edad();

   public abstract String posecion();
}