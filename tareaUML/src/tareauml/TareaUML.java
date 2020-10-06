/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareauml;


import java.util.*;
import java.lang.*;

/**
 *
 * @author maxi
 */
public class TareaUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String separador="------------------------------------------------------";   

        
        Alumno alumnoprimero;
        alumnoprimero= new Alumno("chavo","delocho",332683222,123456);
/*
        System.out.println("Nombre: "+alumnoprimero.getNombre());
        System.out.println("Apellido: "+alumnoprimero.getApellido());
        
        System.out.println(separador);
*/

        System.out.println(separador);

        System.out.println(alumnoprimero.mostrar());
        System.out.println(separador);

        
        alumnoprimero.setNotas(7.5f);
        alumnoprimero.setNotas(6.5f);

        System.out.println(alumnoprimero.getNotas());
        
        System.out.println("El promedio es "+alumnoprimero.getPromedio(alumnoprimero.getNotas())+".");
        
    }
} 

