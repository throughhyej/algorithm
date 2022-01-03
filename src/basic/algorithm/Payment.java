package basic.algorithm;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import resources.MyInfo;

import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * excel 파일 생성을 위해 /src/lib/* 파일 다운로드
 * File > Project Structure > Project Settings > Libraries 에 jar 등록
 * console은 데이터 잘 나옴 > output 확인 필요
 **/

public class Payment {
    public void getPaymentFile() {
        int total = 0;
        int rowIdx = 0;
        int cellIdx;

        try {
            String filePath = MyInfo.filePath + "result/Payment.xlsx";
            FileOutputStream fos = new FileOutputStream(filePath);

            try { // [IntelliJ] 'try' can use automatic resource management: try-with-resources
                HSSFWorkbook workbook = new HSSFWorkbook();
                HSSFSheet sheet = workbook.createSheet("sheet1");

                while (true) {
                    cellIdx = 0;
                    HSSFRow row = sheet.createRow(rowIdx);
                    HSSFCell cell = row.createCell(cellIdx);
                    if (rowIdx == 0) {
                        row.createCell(cellIdx).setCellValue("사번");
                        row.createCell(++cellIdx).setCellValue("시간당 임금률");
                        row.createCell(++cellIdx).setCellValue("일한 시간");
                        row.createCell(++cellIdx).setCellValue("개인별 총수입");
                        row.createCell(++cellIdx).setCellValue("누적액");
                        rowIdx++;
                        continue;
                    }

                    Scanner scan = new Scanner(System.in);
                    System.out.print("사번 : ");
                    // 사번 입력
                    int empNum = scan.nextInt();
                    if (empNum == 0) break; // 사번이 0이면 종료 신호
                    row.createCell(cellIdx).setCellValue(empNum);
                    // 시간당 임금률 입력
                    System.out.print("시간당 임금률 : ");
                    double payRate = scan.nextDouble();
                    row.createCell(++cellIdx).setCellValue(payRate);
                    // 일한 시간 입력
                    System.out.print("일한 시간 : ");
                    int hours = scan.nextInt();
                    row.createCell(++cellIdx).setCellValue(hours);

                    // 임금간
                    double payment = getPersonalIncome(payRate, hours);
                    row.createCell(++cellIdx).setCellValue(payment);

                    // 누적액
                    total += payment;
                    row.createCell(++cellIdx).setCellValue(total);
                    rowIdx++;
                }
                System.out.println("## 총액 : " + total);

                workbook.write(fos);
                fos.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                fos.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private double getPersonalIncome(double payRate, int hours) {
        // 임금률: 시간당 임금률 * 일한 시간 수
        // 임금: 임금률 * 일한 시간 수
        double pay = 0;
        if (hours < 41) {
            pay = calculatePayment((payRate * hours), hours);
        }else {
            pay += calculatePayment((payRate * hours), 40);
            pay += calculatePayment((payRate * hours * 1.5), (hours - 40));
        }
        return pay;
    }
    private double calculatePayment(double rate, int hours) {
        return (rate * hours);
    }
}
