import java.util.Scanner;

public class Grade {
  public static void main(String[] args) {
    int grade;
    Scanner myScanner = new Scanner(System.in);

    System.out.println("ingrese su grado");
    grade = myScanner.nextInt();

    if (grade < 0 || grade > 100) {
      System.out.println("número ingresado está fuera del rango válido.");
    } else if (grade >= 90 && grade <= 100) {
      System.out.println("calificación = A");
    } else if (grade >= 80 && grade <= 89) {
      System.out.println("calificación = B");
    } else if (grade >= 70 && grade <= 79) {
      System.out.println("calificación = C");
    } else if (grade >= 60 && grade <= 69) {
      System.out.println("calificación = D");
    } else {
      System.out.println("calificación = F");
    }
  }
}

// En este ejercicio de calificación, tu tarea es escribir un programa que
// solicite al usuario ingresar un número entre 0 y 100. Luego, el programa
// validará el número ingresado y mostrará la calificación correspondiente según
// la siguiente escala:
// Si la puntuación está entre 90 y 100, se mostrará "A".
// Si la puntuación está entre 80 y 89, se mostrará "B".
// Si la puntuación está entre 70 y 79, se mostrará "C".
// Si la puntuación está entre 60 y 69, se mostrará "D".
// Si la puntuación es menor a 60, se mostrará "F".
// Si el usuario ingresa un número que no está dentro del rango establecido (es
// decir, fuera del intervalo de 0 a 100), el programa debe informar al usuario
// que el número ingresado está fuera del rango válido.
// El programa mostrará en la consola el valor de la calificación obtenida.
// Realiza varias pruebas de tu programa, para asegurarte que la lógica
// implementada sea la correcta.
