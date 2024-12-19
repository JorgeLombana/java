import java.util.Scanner;

public class PasswordComp {
  public static void main(String[] args) {
    String definedPassword = "a1234";
    String userPassword;
    Scanner myScanner = new Scanner(System.in);

    System.out.println("ingrese la contraseña");
    userPassword = myScanner.nextLine();

    if (userPassword.equals(definedPassword)) {
      System.out.println("Acceso concedido");
    } else {
      System.out.println("Acceso denegado");
    }
    myScanner.close();
  }
}

// 1. Verificación de Contraseña:
// En este ejercicio, escribirás un programa que pida al usuario una contraseña
// y verificará si coincide con una contraseña predefinida. Si la contraseña
// ingresada es correcta, se mostrará un mensaje de "Acceso concedido". En caso
// contrario, se mostrará un mensaje de "Acceso denegado".
