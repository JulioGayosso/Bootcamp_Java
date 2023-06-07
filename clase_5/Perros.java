package clase_5;

import java.util.Scanner;

public class Perros {
    public static void main(String[] args){
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("ingresa la edad del perrito");
        Integer edad = cargaDeDatos.nextInt();
        Integer edadPerruna = edad * 7;
        System.out.print("hola la edad de tu cachorro es de " + edadPerruna);

    }
}
