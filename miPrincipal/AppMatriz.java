package miPrincipal;
public class AppMatriz {
    public static void menu() throws PositionIlegalException {
        System.out.println("_________________________");
        System.out.println(" OPERACIONES DE MATRICES ");
        System.out.println("_________________________");
        Matriz m=new Matriz(2,3);
        m.asignarMatriz(0, 0, 5);
        System.out.println("Valor del elemento 0,0-"+m.infoMat(0, 0));

        System.out.println("Filas ="+m.filasMat());
        System.out.println("Columnas ="+m.columnasMat());
    }
    
}