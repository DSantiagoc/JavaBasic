
package javabasic.clase2.Animales;
public class Perro extends Animal{
    
    
    public Perro(String nombre, int edad) {
     this.setNombre(nombre);
    this.setEdad(edad);
    }

    @Override
    public void HacerRuido() {
        System.err.println("gao");
    }

    @Override
    public void comer() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.err.println("Comida de Casa");
    
    
    }
}
