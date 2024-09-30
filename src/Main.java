import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Task #1
        int [] integers = new int [] {1, 2, 3};
        double [] fractional = new double [] {1.57, 7.654, 9.986};
        boolean[] truLse = new boolean [] {1 < 2, 2 > 3};

        // Task #2
        System.out.println("Задача №2");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
            if (i < integers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int fr = 0; fr < fractional.length; fr++) {
            System.out.print(fractional[fr]);
            if (fr < fractional.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int tf = 0; tf < truLse.length; tf++) {
            System.out.print(truLse[tf]);
            if (tf < truLse.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Task #3
        System.out.println("Задача №3");
        for (int i = 2; i <= integers.length && i >= 0; i--) {
            System.out.print(integers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int fr = 2; fr <= fractional.length && fr >= 0; fr--) {
            System.out.print(fractional[fr]);
            if (fr > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int tf = 1; tf <= truLse.length && tf >= 0; tf--) {
            System.out.print(truLse[tf]);
            if (tf > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Task #4
        // всё сломалось
        System.out.println("Задача №4");
        for (int i = 0; i <= integers.length; i++) {
            if (integers[i] % 2 == 0) {
                System.out.print(integers[i]);
            } else {
                integers[i]++;
                System.out.print((integers[i]));
            }
            if (i < integers.length - 1) {
                System.out.print(", ");
            }
        }
        }
    }