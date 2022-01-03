package basic.algorithm;

import java.util.Scanner;

public class Exchange {
/*
    // 방식 1
    public void exchange() {
        // 1. 변수 선언 및 초기화
        // 2. a, b 변수 값을 입력받음
        int temp = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하고 엔터를 눌러주세요. a: ");
        int a = scan.nextInt();
        System.out.print("숫자를 입력하고 엔터를 눌러주세요. b: ");
        int b = scan.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.printf("### a: %d, b: %d", a, b);
    }
 */
    // 방식 2: 객체를 파라미터로 이용 시, return 값 없이 교체된 값으로 사용 가능
    public int[] exchange(int[] arry) {
        int temp = arry[0];
        arry[0] = arry[1];
        arry[1] = temp;
        return arry;
    }
}
