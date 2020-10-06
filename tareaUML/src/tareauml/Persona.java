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


public class Persona {

    private String nombre;
    private String apellido;
    private long dni;

    public Persona() {
    }


    public Persona(String nombre, String apellido, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    /*
public void mostrar(){
    System.out.println("Nombre: "+ nombre);
    System.out.println("Apellido: "+apellido);
    System.out.println("DNI: "+ dni);
    }
    */
    
    public String mostrar(){
     return ("Nombre: "+nombre+"\n"+"Apellido: "+apellido+"DNI: "+dni);
    }
}


