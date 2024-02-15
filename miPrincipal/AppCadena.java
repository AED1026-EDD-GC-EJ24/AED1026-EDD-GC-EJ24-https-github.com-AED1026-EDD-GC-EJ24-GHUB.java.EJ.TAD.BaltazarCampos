package miPrincipal;
public class AppCadena {
    public static void menu() throws PositionIlegalException {
        System.out.println("_________________________");
        System.out.println(" OPERACIONES CON CADENA ");
        System.out.println("_________________________");
        Cadena c=new Cadena();
        c.agregarFinal('M');
        c.agregarFinal('a');      
        c.agregarFinal('r');   
        c.agregarFinal('i');   
        c.agregarFinal('a');
        //c.agregarFinal('&'); //No debe ejecurtase porque tiene 
                               //un caracter inválido
        System.out.println("Valor de la cadena c:"+c.toString());
        System.out.println("Valor de la cadena c invertida:"+c.invertir());
        c.borrarInicio();
        System.out.println("Valor de la cadena c:"+c);    
    }
    
}