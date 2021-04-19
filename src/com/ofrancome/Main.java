package com.ofrancome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (true) {
            final int input = scanner.nextInt();
            if (input == -1) break;

            System.out.println(ServicePrinter.printDeptList(Direction.direct(input)));
        }

    }
}
