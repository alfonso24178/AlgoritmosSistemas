package algoritmos;

import java.util.Scanner;

public class Practica_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();

        
        String[] numbers = input.split(" ");

        
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);
        int sum = num1 + num2;

        
        System.out.println(sum);
        scanner.close();
    }
}
