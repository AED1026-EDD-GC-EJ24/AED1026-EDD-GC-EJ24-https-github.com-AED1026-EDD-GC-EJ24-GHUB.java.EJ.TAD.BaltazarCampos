
package miPrincipal;

public class AppConjunto{
    public static void  menu() throws Exception {
		System.out.println("__________________________________");
		System.out.println("    Operaciones con Conjuntos     ");
        System.out.println("__________________________________");
        
        Conjunto A = new Conjunto();
        if (A.esVacio())
           System.out.println("El Conjunto A esta vacio");
        System.out.println("El conjunto A tiene "+A.cardinal()
                 +" elementos");
        //Anadir elementos al conjunto
    
        A.añadir("A");
        A.añadir("B");
        A.añadir("C");
       
        if (A.esVacio())
           System.out.println("El Conjunto A esta vacio");
        else
           System.out.println("El Conjunto A NO esta vacio");
        System.out.println("El conjunto A tiene "+A.cardinal()
                 +" elementos");

        //Crear otro Conjunto
        Conjunto B = new Conjunto();

        B.añadir("E");
        B.añadir("F");

        if (A.esVacio())
           System.out.println("El Conjunto B esta vacio");
        else
           System.out.println("El Conjunto B NO esta vacio");
        System.out.println("El conjunto B tiene "+B.cardinal()
                 +" elementos");

        //Crear otro conjunto vacio
        Conjunto C = new Conjunto();
        C = A.union(B);
        System.out.println("El conjunto C tiene "+C.cardinal()
                 +" elementos");
        
        C.retirar("A");
        System.out.println("El conjunto C tiene "+C.cardinal()
                 +" elementos");
        System.out.println("Elemento 1="+C.elemento(1));
        System.out.println("Elemento 2="+C.elemento(2));
        System.out.println("Elemento 3="+C.elemento(3));
        System.out.println("Elemento 4="+C.elemento(4));

        //System.out.println("Elemento 5="+C.elemento(5));







        
        
         
    }

}