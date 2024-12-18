import java.util.Scanner;

public class BasicOperators {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int numberOne;
    int numberTwo;

    System.out.println("ingrese el primer número");
    numberOne = myScanner.nextInt();

    System.out.println("ingrese el primer número");
    numberTwo = myScanner.nextInt();

    // sumar
    System.out.println("La suma de el número " + numberOne + " + " + numberTwo + " es: " + (numberOne + numberTwo));
    // restar
    System.out.println("La resta de el número " + numberOne + " - " + numberTwo + " es: " + (numberOne - numberTwo));
    // dividir
    System.out
        .println("La división de el número " + numberOne + " / " + numberTwo + " es: " + (numberOne / numberTwo));
    // multiplicar
    System.out.println(
        "La multiplicación de el número " + numberOne + " * " + numberTwo + " es: " + (numberOne * numberTwo));
    // modulo
    System.out.println(
        "El modulo de el número " + numberOne + " % " + numberTwo + " es: " + (numberOne % numberTwo));
    myScanner.close();
  }
}