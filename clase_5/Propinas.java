package clase_5;

import java.util.Scanner;

public class Propinas {
    public static void main(String[] args){
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("PROPINAS------");
        System.out.println("ingresa el total de la cuenta");
        Integer totalCuenta = cargaDeDatos.nextInt();
        System.out.println("ingresa el porcentaje de propina que deseas dejar");
        Integer porcentajePropina = cargaDeDatos.nextInt();

        double propina = totalCuenta * ((double) porcentajePropina / 100);



        System.out.println("la propina es  : " + propina);
    }
}
