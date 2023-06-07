package clase_5;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Calculadora de Descuentos");
        System.out.println("ingresa el precio original de tu producto");
        Integer precioOriginal = cargaDeDatos.nextInt();
        System.out.println("ingresa el porcentaje de descuento");
        Integer descuento = cargaDeDatos.nextInt();

        Integer precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("el total a pagar es : " + precioFinal);
    }
}
