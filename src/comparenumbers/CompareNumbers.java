package comparenumbers;

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {

        double num1, num2, num3 = 0;

        System.out.println("Ingrese los 3 números que desea comparar");

        Scanner teclado = new Scanner(System.in);

        num1 = teclado.nextDouble();
        
        num2 = teclado.nextDouble();
        num3 = teclado.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero más grande es: " + num1);

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero más grande es: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El numero más grande es: " + num3);
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("Los tres numeros son iguales");
        }
        
        
        
        
    }
}
