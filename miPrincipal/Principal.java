package miPrincipal;

import java.util.Scanner;
// Comentario de prueba
public class Principal {
    
    private static Scanner cosola;

    public static void main(String [] args ){
        Scanner consola = new Scanner (System.in);
        int opc=0;
        do{
            System.out.println("************************");
            System.out.println("TIPOS DE DATOS ABSATRACTOS");
            System.out.println("*************************");
            System.out.println(" 1)Rational ");
            System.out.println(" 2)Matriz ");
            System.out.println(" 3)Conjuto ");
            System.out.println(" 4)Persona ");
            System.out.println(" 5)Fecha ");
            System.out.println(" 6)Cadena ");
            System.out.println(" 7)Numerote ");
            System.out.println(" 8)Cuenta Cheques ");
            System.out.println(" 9)Punto ");
            System.out.println(" 10)Triangulo ");
            System.out.println(" ");
            System.out.println(" 0)Salir ");
        
            opc=cosola.nextInt();
            switch (opc){
                case 1:
                    AppRational.menu();
                    break;
                case 2:
                case 3:
                    AppConjunto.menu();
                    break;
                case 4:
                case 5:
                case 6:
                    AppCadena.menu();
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
            default:
            System.out.println("Valor incorrecto, intente de nuevo");
            }
        }while(opc!=0);
    }
}