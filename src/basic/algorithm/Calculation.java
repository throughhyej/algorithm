package basic.algorithm;

import java.util.Scanner;

public class Calculation {
    public void calculation() {
        // 1. 변수를 선언, 초기화
        int a = 0; int sum = 0; int num = 0; // [IntelliJ] Variable 'a' initializer '0' is redundant

        // 종료 신호가 들어올 때까지 반복적인 수행 필요 (종료 신호: a == 0)
        // ** 0 을 단순 종료 신호로 할지, 입력값으로 할지 체크 필요
        while (true) {
            // a의 값을 입력받음
            Scanner scan = new Scanner(System.in);
            System.out.print("숫자를 입력하고 엔터를 눌러주세요. ");
            a = scan.nextInt();
            if ( a == 0 ) break;
            sum += a;
            num += 1;
        }

        System.out.println("## 합 " + sum );
        System.out.println("## 평균 " + sum / num );
    }

//    public static void main(String[] args) {
//        new Calculation().calculation();
//    }

}
