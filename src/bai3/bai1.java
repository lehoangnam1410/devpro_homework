package bai3;

import java.time.YearMonth;
import java.util.Scanner;

public class bai1 {
	public static void baiToan1() {
		Scanner scanner = new Scanner (System.in);
		  System.out.print("Nhập hệ số a: ");
	        double a = scanner.nextDouble();
	        System.out.print("Nhập hệ số b: ");
	        double b = scanner.nextDouble();
	        System.out.print("Nhập hệ số c: ");
	        double c = scanner.nextDouble();
	        
	        if (a == 0) {
	            System.out.println("Hệ số a phải khác 0");
	            return;
	        }
	        
	        double delta = b * b - 4 * a * c;
	        if (delta < 0) {
	            System.out.println("Phương trình vô nghiệm");
	        } else if (delta == 0) {
	            double x = -b / (2 * a);
	            System.out.println("Phương trình có nghiệm kép: x = " + x);
	        } else {
	            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	            System.out.println("Phương trình có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2);
	        }
	}
	public static void baiToan2() {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Nhập điểm tổng kết: ");
	        double diem = scanner.nextDouble();
	        
	        if (diem >= 8.0) {
	            System.out.println("Xếp loại: Giỏi");
	        } else if (diem >= 7.0) {
	            System.out.println("Xếp loại: Khá");
	        } else if (diem >= 5.0) {
	            System.out.println("Xếp loại: Trung bình");
	        } else {
	            System.out.println("Xếp loại: Yếu");
	        }
	}
	public static void baiToan3() {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Nhập lương cứng (LC): ");
	        double lc = scanner.nextDouble();
	        System.out.print("Nhập doanh số bán hàng (DS): ");
	        double ds = scanner.nextDouble();
	        
	        double luongThucLinh = lc;
	        if (ds < 5000000) {
	            luongThucLinh -= 0.1 * lc;
	            System.out.println("Lương thực lĩnh: " + luongThucLinh);
	        } else if (ds <= 10000000) {
	            System.out.println("Lương thực lĩnh: " + luongThucLinh);
	        } else if (ds <= 15000000) {
	            luongThucLinh += 0.05 * ds;
	            System.out.println("Lương thực lĩnh: " + luongThucLinh);
	        } else {
	            luongThucLinh += 0.1 * ds;
	            System.out.println("Lương thực lĩnh: " + luongThucLinh);
	        }
	}
	public static void baiToan4() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        
        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();
        System.out.println("Số ngày trong tháng: " + daysInMonth);
    }
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     int choice;
     
     do {
         System.out.println("Chọn 1: Thực hiện bài toán 1.");
         System.out.println("Chọn 2: Thực hiện bài toán 2.");
         System.out.println("Chọn 3: Thực hiện bài toán 3.");
         System.out.println("Chọn 4: Thực hiện bài toán 4.");
         System.out.println("Chọn 0: Thoát khỏi chương trình.");
         System.out.print("Nhập lựa chọn của bạn: ");
         choice = scanner.nextInt();
         
         switch (choice) {
             case 1:
                 baiToan1();
                 break;
             case 2:
                 baiToan2();
                 break;
             case 3:
                 baiToan3();
                 break;
             case 4:
                 baiToan4();
                 break;
             case 0:
                 System.out.println("Thoát chương trình.");
                 break;
             default:
                 System.out.println("Lựa chọn không hợp lệ. Thoát chương trình.");
                 choice = 0;
                 break;
         }
     } while (choice != 0);
     
}
}
