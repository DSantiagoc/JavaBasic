
package javabasic.clase2.Estatico;
public class AppEstatico {
    
    public static void main(String [] args){
        
        
        AppEstatico.AtributoEstatico();
        AppEstatico.AtributoEstatico();
          
    }
    
    
    
    public static void MetodoEstatico()
    {
    System.out.println(Estatico.contador);
        
        Estatico est1 = new Estatico();
        Estatico est2 = new Estatico();
        Estatico est3 = new Estatico();
        
        System.out.println(Estatico.contador);
    }
  
    public static void AtributoEstatico()
    {
    double euro = Estatico.dolaraEuro(10d);
         System.out.println(euro);
    }
    
    
}
