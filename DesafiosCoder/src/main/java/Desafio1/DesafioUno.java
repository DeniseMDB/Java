package Desafio1;

import java.util.Scanner;

public class DesafioUno {
    public static void main(String[] args) {
        /*
        Divide un numero float a su parte entera
        y su parte decimal
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal: ");
        float numero = scanner.nextFloat();

        int porcionEntera = (int)numero;
        float porcionDecimal = numero - porcionEntera;

        System.out.println("La porcion entera es: " + porcionEntera);
        System.out.println("La porcion decimal es: " + porcionDecimal);
    }


}
