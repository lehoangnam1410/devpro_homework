package bai1;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 double x = sc.nextDouble();
        // Tính giá trị của biểu thức
        double term1 = (double) a / 10;
        double term2 = Math.pow(a, b);
        double term3 = Math.sin(Math.PI * x) / (3 * Math.sqrt(Math.pow(a + b, 2) + 5));
        double term4 = Math.log(Math.pow(a, 2) + 1);
        double term5 = Math.log10(4 * Math.pow(x, 2 * a) + 3) / Math.log10(3);  // log cơ số 3
        double term6 = term5 / 2.55;

        double result = term1 + term2 - term3 + term4 - term6;

        // Hiển thị kết quả
        System.out.println("Giá trị của biểu thức là: " + result);
	}
}
