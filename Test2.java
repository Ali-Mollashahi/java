/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test1;
import java.util.Scanner;

/**
 *
 * @author ali
 */

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("عدد مورد نظر را وارد کنید: ");
        String number = sc.nextLine();

        System.out.print("عدد وارد شده مبنای چند است؟: ");
        int base = sc.nextInt();

        if (base == 2 || base == 8 || base == 10 || base == 16) {

            System.out.print("مبنای مورد نظر خود را وارد کنید: ");
            int tobase = sc.nextInt();

            if (tobase == 2 || tobase == 8 || tobase == 10 || tobase == 16) {

                int decimal = Integer.parseInt(number, base);
                String result = Integer.toString(decimal, tobase);
                System.out.println("Result: " + result);

            } else {
                System.out.println("Invalid target base. Must be 2, 8, 10, or 16.");
            }

        } else {
            System.out.println("Invalid base. Base must be 2, 8, 10, or 16.");
        }

        sc.close();
    }
}

