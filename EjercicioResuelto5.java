
package ejercicioresuelto5;

import java.util.Scanner;

public class EjercicioResuelto5 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double suma, x, y; //Declaracion de variables.
        suma=0;
        System.out.println("Ingrese el valor de X: ");
        x=entrada.nextInt(); //Se ingresa X.
        suma=suma+x;
        System.out.println("Ingrese el valor de Y: ");
        y=entrada.nextInt(); //Se ingresa Y.
        x=x+Math.pow(y,2);
        suma=suma+(x/y); //Valor final de X.
        System.out.println("EL VALOR DE LA SUMA ES: "+suma);
    }
    
}
