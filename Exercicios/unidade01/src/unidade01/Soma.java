package unidade01;

import java.util.Scanner;

public class Soma {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    int num1 = scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    int num2 = scanner.nextInt();
    int resultado = num1 + num2;
    System.out.println("O resultado da soma é: " + resultado);
  }
}