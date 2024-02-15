package miPrincipal;
public class AppPunto {
    public static void menu() {
        System.out.println("_________________________");
        System.out.println(" OPERACIONES CON PUNTOS  ");
        System.out.println("_________________________"); 
        Punto p1=new Punto();
        Punto p2=new Punto();
        p1.leer();
        p1.despliega();
        p2.leer();
        p2.despliega();
        System.out.println("Distancia entre puntos: "+p1.distancia(p2));
    }
    
}