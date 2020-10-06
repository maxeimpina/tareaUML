/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tareauml;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maxi
 */

public class Alumno extends Persona {
    
    
// atributos propios de la clase alumno    
    private int padron;
    private ArrayList<Float> notas; 
     
    Scanner lector = new Scanner (System.in);



//constructores 
    
public Alumno(String nombre, String apellido, long dni, int padron) {
        super(nombre,apellido,dni);
        this.padron= padron;
        this.notas=new ArrayList<Float>();      //al inicializar
                                                //el constructor inicializo el array
    }
    
    
public Alumno(String nombre, String apellido, long dni) {
        super(nombre,apellido,dni);
    }
    

//setters y getters


    private int getPadron() {
        return padron;
    }

    private void setPadron(int padron) {
        this.padron = padron;
    }


    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNotas(float nota) {
        notas.add(nota);
     }
   
    public Float getPromedio(ArrayList<Float> notas){
    /*
        suma las notas del array notas y 
        devuelve el promedio
    */
 
    float promedio;float sumatoria = 0;
    
    if (!(notas.isEmpty())){       //si tiene algun contenido
        /*
        
        notas.forEach((indice))-> sumatoria=sumatoria+indice;
        for (Integer s : notas){
        sumatoria=sumatoria+indice;
        }
             */
    
     for (int indice=0; indice<notas.size(); indice++){
        sumatoria = sumatoria+notas.get(indice);
        }
      }
        promedio = (sumatoria/(notas.size()));
    return promedio;
    }
    
    /*
        @Override
    public void mostrar(){
    System.out.println("Padron: "+ padron);
    System.out.println("Notas: "+ notas);
    }
*/
    

    @Override
    public String mostrar(){
    return ("Nombre: "+super.getNombre()+"\n"+"Apellido: "+super.getApellido()+"\n"+"DNI: "+super.getDni()+
            "\n"+"Padron: "+padron+"\n"+"Notas: "+notas);
 }

}
