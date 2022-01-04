package basic.algorithm;

import java.util.Scanner;

public class PrintOdd {
    public void printOdd() {
        Scanner scan = new Scanner(System.in);
        System.out.print("### 수의 범위를 지정하시오. : ");
        int max = scan.nextInt();

        for (int i=1; i<=max; i++) {
            if (i % 2 != 0) System.out.printf("%d\t", i);
            if (i % 10 == 0) System.out.println();
        }
    }
}
