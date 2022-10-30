package paqueteHumano;
import java.util.Scanner;
public class hombre extends  humanos{
    public hombre(){
       super("jose", "martinez", 32);
    }
    @Override
    public String nombre(){
        return"minombre es jose martinez, padre";
    }
    @Override
    public String stadoCivil(){
        String sr_sanchez;
        Scanner delivery=new Scanner(System.in);
        System.out.println("ingresa el nombre de tu esposa");
        sr_sanchez=delivery.nextLine();
        return "estoy casado con la Sr" + sr_sanchez;
    }
    @Override
    public int edad(){
        Scanner delivery=new Scanner(System.in);
        System.out.println("ingresa tu edad");
        this.edad=delivery.nextInt();
        System.out.print("esta es la edad del Sr");
        return this.edad;
    }
    @Override
    public String posecion (){
        return "mi posecion es un vehiculo";
    }
}
