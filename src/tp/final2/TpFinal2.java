package tp.final2;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Scanner;
import tp.final2.menu.BienvenidoMenu;

public class TpFinal2 {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
    
//        ArrayList<Recepcionista> empleado = new ArrayList<Recepcionista>();
//        empleado.add(new Recepcionista("agustindominguez95@hotmail.com", "123", "Agustin", "Dominguez"));
//        empleado.add(new Recepcionista("ag@hotmail.com", "619", "Andres", "Dum"));
//        empleado.add(new Recepcionista("teamchilegodoflevel@hotmail.com", "123456789", "pepe", "grillo"));
//        
//        for(Recepcionista e: empleado){
//            
//            System.out.println(e.toString());
//        
//        }
//        
//        Habitacion uno = new Habitacion(1, Habitacion.Estado.DISPONIBLE, Habitacion.Tipo.INDIVIDUAL);
//        System.out.println(uno);
//        
//        Gson gson = new Gson();
          ArrayList<Pasajero> pasajero = new ArrayList<Pasajero>();
          Pasajero p= new Pasajero("agustin", "caceres", 223, "colon 412", "agustin@hotmail.com", "39336482" , "argentina"); 
          Recepcionista recep = new Recepcionista ("agustindominguez95@hotmail.com", "123", "Agustin", "Dominguez",pasajero);
          pasajero.add(p);
          System.out.println("P= "+p);
          try{
              recep.ModificarPasajero(p, "39336482");
              System.out.println("El pasajero se ha editado exitosamente");
              System.out.println("El nuevo p= "+p);
          }catch(PasajeroNoEncontradoException e){
              System.out.println(e.getMessage());
          }
          
          
          
        }
          
}
