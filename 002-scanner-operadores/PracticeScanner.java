import java.util.Scanner;

public class PracticeScanner {
  public static void main(String[] args) {
    String userName;
    int edad;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su nombre");
    userName = scanner.nextLine();

    System.out.println("Ingrese su edad");
    edad = scanner.nextInt();

    System.out.println("Su nombre es: " + userName + " de " + edad + " años de edad");
    scanner.close();
  }
}
