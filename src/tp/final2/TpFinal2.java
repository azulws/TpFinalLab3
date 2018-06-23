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

        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
        ArrayList<Pasajero> pasajero = new ArrayList<Pasajero>();
        Pasajero p = new Pasajero("agustin", "caceres", 223, "colon 412", "agustin@hotmail.com", "39336482", "argentina");
        Pasajero p1 = new Pasajero("agustin2", "caceres2", 2232, "colon 4122", "agustin@hotmail.com", "39336482", "argentina");
        Pasajero p2 = new Pasajero("agustin3", "caceres3", 2233, "colon 4123", "agustin@hotmail.com", "39336482", "argentina");
        Pasajero p3 = new Pasajero("agustin4", "caceres4", 2234, "colon 4124", "agustin@hotmail.com", "39336482", "argentina");
        Pasajero p4 = new Pasajero("agustin5", "caceres5", 2235, "colon 4125", "agustin@hotmail.com", "39336482", "argentina");
        Pasajero p5 = new Pasajero("agustin6", "caceres6", 2236, "colon 4126", "agustin@hotmail.com", "39336482", "argentina");
        Pasajero p6 = new Pasajero("agustin7", "caceres7", 2237, "colon 4127", "agustin@hotmail.com", "39336482", "argentina");
        Pasajero p7 = new Pasajero("agustin8", "caceres8", 2238, "colon 4128", "agustin@hotmail.com", "39336482", "argentina");
        Recepcionista recep = new Recepcionista("agustindominguez95@hotmail.com", "123", "Agustin", "Dominguez", pasajero, habitaciones);
        pasajero.add(p);
        pasajero.add(p1);
        pasajero.add(p2);
        pasajero.add(p3);
        pasajero.add(p4);
        pasajero.add(p5);
        pasajero.add(p6);
        pasajero.add(p7);
        System.out.println("P= " + pasajero);
        Serializar(pasajero);
        
//        Habitacion pepita = new Habitacion(1, Habitacion.Tipo.INDIVIDUAL);
//        Habitacion esme = new Habitacion(2, Habitacion.Tipo.DOBLE);
//        Habitacion dasd = new Habitacion(3, Habitacion.Tipo.SUITES);
//        Habitacion ass = new Habitacion(4, Habitacion.Tipo.TRIPLE);
//        Habitacion pep = new Habitacion(5, Habitacion.Tipo.INDIVIDUAL);
//        Habitacion pepital = new Habitacion(6, Habitacion.Tipo.INDIVIDUAL);
//        Habitacion esmee = new Habitacion(7, Habitacion.Tipo.DOBLE);
//        Habitacion dasdd = new Habitacion(8, Habitacion.Tipo.SUITES);
//        Habitacion asss = new Habitacion(9, Habitacion.Tipo.TRIPLE);
//        Habitacion pepp = new Habitacion(10, Habitacion.Tipo.INDIVIDUAL);
//        Habitacion pepitas = new Habitacion(11, Habitacion.Tipo.INDIVIDUAL);
//        Habitacion esmes = new Habitacion(12, Habitacion.Tipo.DOBLE);
//        Habitacion dasda = new Habitacion(13, Habitacion.Tipo.SUITES);
//        Habitacion assw = new Habitacion(14, Habitacion.Tipo.TRIPLE);
//        Habitacion pepq = new Habitacion(15, Habitacion.Tipo.INDIVIDUAL);
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
//        recep.tareas(4,2);
//        System.out.println(ass.toString());
//        Reserva reserv = new Reserva(pep, p);
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
