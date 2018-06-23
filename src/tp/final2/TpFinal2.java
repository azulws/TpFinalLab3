package tp.final2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import tp.final2.menu.BienvenidoMenu;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class TpFinal2 {

    private static Scanner scanner = new Scanner(System.in);

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
        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
        ArrayList<Pasajero> pasajero = new ArrayList<Pasajero>();
        Pasajero p = new Pasajero("agustin", "caceres", 223, "colon 412", "agustin@hotmail.com", "39336482", "argentina");
        Pasajero a = new Pasajero("tomas", "gonzales", 331, "colon 561", "tomas@hotmail.com", "49448231", "argentina");
        pasajero.add(a);
        pasajero.add(p);
        Serializar(pasajero);
//        Recepcionista recep = new Recepcionista("agustindominguez95@hotmail.com", "123", "Agustin", "Dominguez", pasajero, habitaciones);
//        pasajero.add(p);
        
        
//          try{
//              recep.ModificarPasajero(p, "39336482");
//              System.out.println("El pasajero se ha editado exitosamente");
//              System.out.println("El nuevo p= "+p);
//          }catch(PasajeroNoEncontradoException e){
//              System.out.println(e.getMessage());
//          }
//        Habitacion pepita = new Habitacion(1, Habitacion.Tipo.INDIVIDUAL);
//        Habitacion esme = new Habitacion(2, Habitacion.Tipo.DOBLE);
//        Habitacion dasd = new Habitacion(3, Habitacion.Tipo.SUITES);
//        Habitacion ass = new Habitacion(4, Habitacion.Tipo.TRIPLE);
//        Habitacion pep = new Habitacion(5, Habitacion.Tipo.INDIVIDUAL);
//        habitaciones.add(pepita);
//        habitaciones.add(esme);
//        habitaciones.add(dasd);
//        habitaciones.add(ass);
//        habitaciones.add(pep);
//        System.out.println(habitaciones);
//        recep.checkIn(4);
//        System.out.println(ass.toString());
//        recep.checkout(4);
//        System.out.println(ass.toString());
//        Reserva reserv = new Reserva(pep,p);
//        System.out.println(reserv);
    }
    
    public static void Serializar (List pasajero){
        Gson gson = new Gson();
        String strJson=gson.toJson(pasajero);
        
        FileWriter writer=null;
        try{
        writer= new FileWriter("pasajeros.son");
        writer.write(strJson);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(writer != null)
        {
            try{
                writer.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    }
}
