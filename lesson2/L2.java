
// Код для Teams: heh735e

import java.util.*;

public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int d = a*b*c;
        // System.out.println(d);
        //
        /////////////////////////////////////
        //
        // Ввод вещественных чисел зависит
        // от настроек локали:
        // double a = sc.nextDouble();
        // double b = sc.nextDouble();
        // System.out.println(a+b);
        //
        // $ java L2
        // 1,2 3,4
        // 4.6
        //
        // $ LC_ALL=C java L2
        // 1.2 3.4
        // 4.6
        //
        /////////////////////////////////////
        //
        // int a = sc.nextInt();
        // if (a % 2 == 0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }
        /////////////////////////////////////
        // Вводятся координаты точки,
        // проверить, что она ниже прямой
        // через (0,5) и (4,0)
        //
        // Уравнение прямой через эти точки?
        // y = kx + b
        // Система уравнений
        // 5 = b
        // 0 = 4k + 5
        // k = -1.25
        // Уравнение:
        // y = -1.25x + 5
        // double x = sc.nextDouble();
        // double y = sc.nextDouble();
        // // if (y <= -1.25*x + 5) {
        // //     if (y >= 0) {
        // //         if (x >= 0) {
        // //             System.out.println("Inside");
        // //         } else {
        // //             System.out.println("Outside");
        // //         }
        // //     } else {
        // //         System.out.println("Outside");
        // //     }
        // // } else {
        // //     System.out.println("Outside");
        // // }
        // if (y <= -1.25*x + 5 && y >= 0 && x >= 0) {
        //     System.out.println("Inside");
        // } else {
        //     System.out.println("Outside");
        // }
        int i = 1;
        while (i < 16384) {
          System.out.println(i);
          i = i*2;
        }
        // Вводятся числа, вам нужно посчитать сумму этих чисел.
        // Числа вводятся до тех пор, пока не введено 0
        // Например, можно ввести числа
        // 10 3 -2 -3 5 0
        // 13

        // int sum = 0;
        // int x = 1;
        // while (x != 0) {
        //   x = sc.nextInt();
        //   sum += x; // sum = sum + x;
        // }
        // System.out.println(sum);

        // int sum = 0;
        // int x = sc.nextInt();
        // while (x != 0) {
        //     sum += x;
        //     x = sc.nextInt();
        // }
        // System.out.println(sum);

        int sum = 0;
        do {

        } while ();











        // Человек загадывает число от 0 до 1023 (включительно).
        // Компьютер спрашивает, больше или меньше загаданное
        // указанного числа. Чтобы спросить, больше или меньше числа X,
        // вывести "? X", например, "? 512"
        // Ответ 0 означает "меньше", ответ 1 - "не меньше".
        // Программа должна вывести ответ в виду "! X", например,
        // "! 123"
        // Для того, чтобы не переводить строку в конце вывода,
        // используйте System.out.print. Также можно использовать
        // конструкцию вида System.out.println("! " + x)
    }
}
