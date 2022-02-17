package CYCLE;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int n = input.nextInt();
        int c = 1;
        int a = 0;
        int b;
        if (n > 0) {
            for (c = 1; c < n; c++) {
                b = c % 2;
                if (b == 0) {
                    continue;
                }
                a = a + c;
            }
            System.out.println("Суммируя все нечетные числа от 1 до " + n + " получаем " + a);
        }
        else {
            System.out.printf("Ну попросили же целое и положительное...");
        }
    }
}