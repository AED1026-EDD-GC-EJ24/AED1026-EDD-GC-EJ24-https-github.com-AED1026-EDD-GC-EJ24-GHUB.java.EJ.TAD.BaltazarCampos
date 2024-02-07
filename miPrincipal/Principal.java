package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("TIPOS DE DATOS ABSTRACTOS
            \n 1) Rational
            \n 2) Matriz 
            \n 3) Conjunto
            \n 4) Persona
            \n 5) Fecha
            \n 6) Cadena 
            \n 7) Numerote
            \n 8) Cuenta cheques 
            \n 9) Punto
            \n 10) Triangulo
            \n 0) Salir
            \n >> ");
            opc = sc.nextInt();
            switch(opc) {
                case 1:
                    AppRational();
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:   
                default:
                    System.out.println("Valor incorrecto, intenta de nuevo"); 
            }
        } while(opc!=0);
    }
}