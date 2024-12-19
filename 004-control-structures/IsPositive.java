import java.util.Scanner;

public class IsPositive {
  public static void main(String[] args) {
    int number;
    Scanner myScanner = new Scanner(System.in);

    System.out.println("ingrese un número");
    number = myScanner.nextInt();

    if (number % 2 == 0) {
      System.out.println("El número ingresado es par");
    } else {
      System.out.println("El número ingresado es impar");
    }
    myScanner.close();
  }
}
