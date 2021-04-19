package com.ofrancome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Direction direction = new Direction();
        final ServicePrinter servicePrinter = new ServicePrinter();
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            final int input = scanner.nextInt();
            if (input == -1) break;

            System.out.println(servicePrinter.printDeptList(direction.direct(input)));
        }

    }
}
