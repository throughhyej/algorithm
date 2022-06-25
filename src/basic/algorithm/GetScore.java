package basic.algorithm;

import java.util.Scanner;

public class GetScore {
    public void getScore() {
        int[][] scoreInfo = new int[2][10];

        for (int i=0; i<scoreInfo[0].length; i++) {
            scoreInfo[0][i] = (i+1); // 번호
            scoreInfo[1][i] = (i+1) * 10; // 점수
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("## 몇 번의 점수가 궁금한가요? ");
        int bunho = scan.nextInt();

        for (int i=0; i<scoreInfo[0].length; i++) {
            if (scoreInfo[0][i] == bunho) System.out.printf("%d의 점수: %d", bunho, scoreInfo[1][i]);
        }

    /*
        try {
            BufferedReader br = new BufferedReader(new FileReader(MyInfo.filePath + "score.txt"));
            String str;
            while ((str = br.readLine()) != null) { }
            br.close();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
     */
    }

//    public static void main(String[] args) {
//        new GetScore().getScore();
//    }

}
