package com.ofrancome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Direction direction = new Direction();
        while (true) {
            final int input = scanner.nextInt();
            if (input == -1) break;

            System.out.println(Printer.printDeptList(direction.direct(input)));
        }

    }
}
