import basic.algorithm.BubbleSort;
import basic.algorithm.Calculation;
import basic.algorithm.Exchange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exchange.java
        // new Exchange().exchange(); // 방식 1
        int[] arry = new int[] {10, 20}; 
        arry = new Exchange().exchange(arry); // 방식 2: 객체를 파라미터로 이용 시, return 값 없이 교체된 값으로 사용 가능
        for (int num : arry) {
            System.out.println("### num " + num);
        }

        // Calculation.java
        // new Calculation().calculation();
    }
}
