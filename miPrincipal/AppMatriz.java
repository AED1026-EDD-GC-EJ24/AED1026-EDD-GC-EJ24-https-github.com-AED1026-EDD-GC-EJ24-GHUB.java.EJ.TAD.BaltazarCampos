package miPrincipal;
public class AppMatriz {
    public static void menu() throw PosicionIlegalException {
        System.out.println("====================");
        System.out.println("Operaciones matrizes");
        System.out.println("====================");
        Matriz m = new Matriz(2,3);
        m.asignarMatriz(0,0,5);
        System.out.println("Valor del elemento 0,0 = "+m.infoMat(0,0)); 
    }
}