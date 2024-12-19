import java.util.Scanner;

public class BasicCalculator {
  public static void main(String[] args) {
    int numberOne;
    int numberTwo;
    int operation;
    String result;

    Scanner myScanner = new Scanner(System.in);

    System.out.println("Ingresa el primer número");
    numberOne = myScanner.nextInt();

    System.out.println("Ingresa el segundo número");
    numberTwo = myScanner.nextInt();

    System.out.println("Selecciona una opción: \n 1.sumar \n 2.restar \n 3.multiplicar \n 4.dividir");
    operation = myScanner.nextInt();

    result = "El resultado de la ";
    result = (operation == 1)
        ? result += "suma entre el Nro " + numberOne + " y el Nro " + numberTwo + " es: " + (numberOne + numberTwo)
        : (operation == 2)
            ? result += "resta entre el Nro " + numberOne + " y el Nro " + numberTwo + " es: " + (numberOne - numberTwo)
            : (operation == 3)
                ? result += "multiplicación entre el Nro " + numberOne + " y el Nro " + numberTwo + " es: "
                    + (numberOne * numberTwo)
                : (operation == 4)
                    ? result += "división entre el Nro " + numberOne + " y el Nro " + numberTwo + " es: "
                        + (numberOne / numberTwo)
                    : "El número de operación ingresado es incorrecto";
    System.out.println(result);
  }
}
