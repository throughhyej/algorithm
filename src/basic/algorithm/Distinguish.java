package basic.algorithm;

import java.util.Scanner;

public class Distinguish {
    public void distinguish() {
        String result;

        Scanner scan = new Scanner(System.in);
        System.out.print("## 숫자를 입력하시오. ");
        int num = scan.nextInt();

        if (num > 0) result = "양수";
        else if (num < 0) result = "음수";
        else result = "제로";

        System.out.println("### result > " + result);
    }

//    public static void main(String[] args) {
//        new Distinguish().distinguish();
//    }
}
