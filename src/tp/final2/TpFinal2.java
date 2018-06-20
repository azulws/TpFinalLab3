package tp.final2;

import com.google.gson.Gson;
import java.util.ArrayList;
import tp.final2.menu.BienvenidoMenu;

public class TpFinal2 {

    public static void main(String[] args) {
        ArrayList<Recepcionista> empleado = new ArrayList<Recepcionista>();
        empleado.add(new Recepcionista("agustindominguez95@hotmail.com", "123", "Agustin", "Dominguez"));
        empleado.add(new Recepcionista("ag@hotmail.com", "619", "Andres", "Dum"));
        empleado.add(new Recepcionista("teamchilegodoflevel@hotmail.com", "123456789", "pepe", "grillo"));
        
        for(Recepcionista e: empleado){
            
            System.out.println(e.toString());
        
        }
        
        Habitacion uno = new Habitacion(1, Habitacion.Estado.DISPONIBLE, Habitacion.Tipo.INDIVIDUAL);
        System.out.println(uno);
        
        Gson gson = new Gson();
        System.out.println("asd");
        System.out.println("asd");
    
    }

    }
