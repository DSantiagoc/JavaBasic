
package javabasic.clase2.Animales;

import java.util.HashSet;
import java.util.Set;

public  class Tigre extends Animal{

    public Tigre(String nombre, int edad) {
   
    this.setNombre(nombre);
    this.setEdad(edad);
    }

    @Override
    public void HacerRuido() {
        System.err.println("grrrrr");
    }

    public void HacerRuido(Boolean molestar) {
        System.err.println("gfgfgfgfgfg");
    }

    @Override
    public void comer() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    System.err.println("Carne");
    
    }
    
    
}
