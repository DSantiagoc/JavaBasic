
package javabasic.clase2.Animales;

public class Zoologico {
    
    public static void main (String[] args)
    {
    
    Tigre diego = new Tigre("dd",2) {

        @Override
        public void comer() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    } ;
        diego.HacerRuido();
        diego.HacerRuido(true);
        diego.comer();
        
        Perro bruce = new Perro("dd",2) ;
        bruce.HacerRuido();
        bruce.comer();
        
    }
    
}
