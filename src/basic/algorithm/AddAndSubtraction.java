package basic.algorithm;

public class AddAndSubtraction {
    public void addAndSubtraction() {
        int total = 0;
        for (int i=1; i<=100; i++) {
            if (i % 2 != 0) { // 홀수
                total += i;
            }else { // 짝수
                total -= i;
            }
        }
        System.out.printf("### total : %d", total);

    /*
        // 흐름도
        int total = 0;
        int flag = 0;

        for (int i=1; i<=100; i++) {
            if (flag == 0) {
                total += i;
                flag = 1;
            }else {
                total -= i;
                flag = 0;
            }
        }
        System.out.printf("### total : %d", total);
     */
    }

//    public static void main(String[] args) {
//        new AddAndSubtraction().addAndSubtraction();
//    }
}
