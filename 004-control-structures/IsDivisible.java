import java.util.Scanner;

public class IsDivisible {
  public static void main(String[] args) {
    int number;
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Ingrese el número a evaluar");
    number = myScanner.nextInt();
    if (number % 3 == 0 && number % 5 == 0) {
      System.out.println("el número es divisible por 3 y 5");
    } else if (number % 3 == 0) {
      System.out.println("el número es divisible por 3");
    } else if (number % 5 == 0) {
      System.out.println("el número es divisible por 5");
    } else {
      System.out.println("el número no es divisible por ninguno ");
    }

  }
}

// Actividad: Divisibilidad
// En esta actividad, escribirás un programa que solicite al usuario un número y
// determine si es divisible por 5, por 3, por ambos o por ninguno. El resultado
// se mostrará en pantalla.
// 💡 Un número es divisible por otro si al dividirlos no queda ningún residuo.
// Por ejemplo, si el residuo de la división es cero, entonces el número es
// divisible por el otro. Utilizaremos el operador de módulo (%) para verificar
// si un número es divisible por otro en este ejercicio.
