package basic.algorithm;

public class Sum {
    public static int oddSum = 0;
    public static int evenSum = 0;

    public void sum() {
        add();
        output();
    }

    private void add() {
        for (int i=1; i<=100; i++) {
            if (i % 2 == 0) { // 짝수
                evenSum += i;
            }else { // 홀수
                oddSum += i;
            }
        }
    }

    private void output() {
        System.out.printf("홀수 합: %d, 짝수 합: %d\n", oddSum, evenSum);
    }
}
