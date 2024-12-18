import java.util.Scanner;

public class ComparisonOperators002 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int numberOne;
    int numberTwo;
    int numberThree;
    int numberFour;

    System.out.println("Ingrese el primer número");
    numberOne = myScanner.nextInt();

    System.out.println("Ingrese el segundo número");
    numberTwo = myScanner.nextInt();

    System.out.println("Ingrese el tercer número");
    numberThree = myScanner.nextInt();

    System.out.println("Ingrese el cuarto número");
    numberFour = myScanner.nextInt();

    // A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
    System.out.println((numberOne > numberTwo) && (numberThree > numberFour));
    
    // B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
    System.out.println((numberOne > numberTwo) || (numberThree > numberFour));
  }
}