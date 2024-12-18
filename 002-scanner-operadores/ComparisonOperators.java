import java.util.Scanner;

public class ComparisonOperators {
  public static void main(String[] args) {
    int baseRectangle;
    int heightRectangle;
    int perimeter;
    int area;
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Ingrese la base");
    baseRectangle = myScanner.nextInt();

    System.out.println("Ingrese la altura");
    heightRectangle = myScanner.nextInt();

    perimeter = 2 * baseRectangle + 2 * heightRectangle;
    System.out.println("El perímetro es: " + perimeter);

    area = baseRectangle * heightRectangle;
    System.out.println("El área es: " + area);
    myScanner.close();
  }
}
