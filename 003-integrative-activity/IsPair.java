import java.util.Scanner;

public class IsPair {
  public static void main(String[] args) {
    int numberOne;
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Ingrese un número");
    numberOne = myScanner.nextInt();

    System.out.println("El número " + numberOne + " es " + ((numberOne % 2 == 0) ? "par" : "impar"));
  }
}