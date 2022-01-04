package basic.algorithm;

import java.util.Scanner;

public class Average {
    public void average() {
        int cnt = 10;
        int[] arry = new int[cnt];
        int total = 0;
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<arry.length; i++) {
            System.out.print("## 점수를 입력하시오. : ");
            int num = scan.nextInt();
            arry[i] = num;
            total += arry[i];
        }

        int avg = total / cnt;
        System.out.printf("## avg : %d", avg);
    }
}
