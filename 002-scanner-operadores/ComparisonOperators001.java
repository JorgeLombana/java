import java.util.Scanner;

public class ComparisonOperators001 {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int numberOne;
    int numberTwo;

    System.out.println("Ingrese un número");
    numberOne = myScanner.nextInt();

    System.out.println("Ingrese otro número");
    numberTwo = myScanner.nextInt();

    System.out.println(numberOne + "  > " + numberTwo + " = " + (numberOne > numberTwo));
    System.out.println(numberOne + " != " + numberTwo + " = " + (numberOne != numberTwo));
    System.out.println(numberOne + " % 2 + = " + (numberOne % 2 == 0));

  }
}
