package com.bridgelabs.QA;

import java.util.Scanner;

public class FindLargestTwo {
        public static void find() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter three numbers");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if(a < b && a < c)
                System.out.println("First two largest numbers are "+b+" & "+c);
            else if (b < a && b < c) {
                System.out.println("First two largest numbers are "+a+" & "+c);
            }
            else
                System.out.println("First two largest numbers are "+a+" & "+b);
        }

        public static void main(String[] args) {
            FindLargestTwo.find();
        }
}
