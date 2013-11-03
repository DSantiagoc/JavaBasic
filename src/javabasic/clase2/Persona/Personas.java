
package javabasic.clase2.Persona;

public class Personas {
    public String nombre;
public String apellidos;
public int edad;


public Personas()
  {
  
  
  }


    public Personas(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
   public String getnombresapellidos() {
        return nombre ;
    }
    
    
    public void setnombresapellidos(String nombre , String apellidos)
    {
        this.nombre = nombre; 
        this.apellidos = apellidos;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }


}
