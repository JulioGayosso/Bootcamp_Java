package clase_5;

import java.util.Scanner;

public class MillasKm {
    public static void main(String[] args){
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("programa de millas  a kilometros");
        System.out.println("ingresa las millas que vas a convertir");
        Integer millas = cargaDeDatos.nextInt();
        Double kilómetros = millas * 1.60934;
        System.out.println("la conversion a kilometros es : " + kilómetros);




    }
}
