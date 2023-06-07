package clase_5;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        // Crear una instancia de la clase Random
        Random random = new Random();

        // Generar un número aleatorio en el rango del 1 al 100
        Integer numeroSecreto = random.nextInt(100) + 1;

        // Imprimir el número aleatorio generado
        //System.out.println("Número aleatorio: " + numeroSecreto);

        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Adivina un numero entre el 1 al 100 por favor");
        Integer numeroUsario = cargaDeDatos.nextInt();

        if (numeroUsario == numeroSecreto) {
            System.out.println("Suertudo , Adivinaste mi numero secreto");
        } else {
            System.out.println("numero incorrecto , el numero era :" + numeroSecreto);
        }
    }
}