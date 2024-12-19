import java.util.Scanner;

public class DiscountComp {
  public static void main(String[] args) {
    float price;
    Scanner myScanner = new Scanner(System.in);

    System.out.println("ingrese el precio");
    price = myScanner.nextFloat();

    if (price >= 100) {
      System.out.println("El costo de su producto es: " + (price - ((10 * price) / 100)));
    } else {
      System.out.println("el precio es el mismo :" + price);
    }
    myScanner.close();
  }
}
// 2. Cálculo de Descuento:
// En este ejercicio, desarrollarás un programa que solicitará al usuario el
// precio de un producto y determinará si tiene derecho a un descuento. Si el
// precio es igual o mayor a $100, se aplicará un descuento del 10% y se
// mostrará el nuevo precio con descuento. De lo contrario, se mostrará el
// precio original sin descuento.
