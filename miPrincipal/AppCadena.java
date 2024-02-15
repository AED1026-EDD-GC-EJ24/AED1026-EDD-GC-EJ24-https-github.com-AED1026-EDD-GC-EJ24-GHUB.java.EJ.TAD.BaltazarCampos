package miPrincipal;
public class AppCadena {
    public static void menu() throws PositionIlegalException {
        System.out.println("_________________________");
        System.out.println(" OPERACIONES CON CADENA ");
        System.out.println("_________________________");
        Cadena c=new Cadena();
        c.agregarFinal('B');
        c.agregarFinal('A');      
        c.agregarFinal('L');   
        c.agregarFinal('T');   
        c.agregarFinal('A');
        System.out.println("Valor de la cadena c:"+c.toString());
        System.out.println("Valor de la cadena c invertida:"+c.invertir());
        c.borrarInicio();
        System.out.println("Valor de la cadena c:"+c);    
    }
    
}