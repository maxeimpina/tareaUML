/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareauml;

/**
 *
 * @author maxi
 */
public class Docente extends Persona {
    
    
    
// atributos propios de la clase docente

    int legajo;
    short antiguedad;

    public Docente(String nombre, String apellido, long dni, int legajo, short antiguedad) {
        super(nombre,apellido,dni);
        this.legajo = legajo;
        this.antiguedad = antiguedad;
    }
    
    public Docente(String nombre, String apellido, long dni){
        super(nombre,apellido,dni);
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setAntiguedad(short antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getLegajo() {
        return legajo;
    }

    public short getAntiguedad() {
        return antiguedad;
    }
    
  
    /*
    @Override
    public void mostrar(){
    System.out.println("Antiguedad: "+ antiguedad);
    System.out.println("Legajo : "+legajo);
    }
    */
    

    
    @Override
 public String mostrar(){
     return ("Nombre: "+super.getNombre()+"\n"+"Apellido: "+super.getApellido()+"\n"+"DNI: " +
               super.getDni()+"Antiguedad: "+antiguedad+"\n"+"Legajo: "+legajo);
    }    
    
    
    
    
    
    
    
}
