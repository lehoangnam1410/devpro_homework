package bai3;

import java.util.Scanner;

public class bai4 {
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("Chọn 1: Thực hiện bài toán 1.");
	            System.out.println("Chọn 2: Thực hiện bài toán 2.");
	            System.out.println("Chọn 3: Thực hiện bài toán 3.");
	            System.out.println("Chọn 4: Thực hiện bài toán 4.");
	            System.out.println("Chọn 5: Thực hiện bài toán 5.");
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
	                case 5:
	                    baiToan5();
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

	        scanner.close();
	    }

	    // Kiểm tra số nguyên tố
	    public static void baiToan1() {
	    	Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập một số nguyên: ");
	        int num = scanner.nextInt();
	        boolean isPrime = true;

	        if (num <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime) {
	            System.out.println(num + " là số nguyên tố.");
	        } else {
	            System.out.println(num + " không phải là số nguyên tố.");
	        }
	    }

	    // In ra màn hình tổng của n số nguyên tố đầu tiên
	    public static void baiToan2() {
	    	Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số lượng số nguyên tố cần tính tổng: ");
	        int n = scanner.nextInt();
	        int count = 0;
	        int sum = 0;
	        int num = 2;

	        while (count < n) {
	            boolean isPrime = true;
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                sum += num;
	                count++;
	            }
	            num++;
	        }

	        System.out.println("Tổng của " + n + " số nguyên tố đầu tiên là: " + sum);
	    }

	    // In ra màn hình các bảng cửu chương từ bảng 2 đến bảng 10
	    public static void baiToan3() {
	    	Scanner scanner = new Scanner(System.in);
	        for (int i = 2; i <= 10; i++) {
	            System.out.println("Bảng cửu chương " + i + ":");
	            for (int j = 1; j <= 10; j++) {
	                System.out.println(i + " x " + j + " = " + (i * j));
	            }
	            System.out.println();
	        }
	    }

	    // Tính gần đúng sin(x) với sai số epsilon
	    public static void baiToan4() {
	        System.out.print("Nhập giá trị x (radian): ");
	        double x = scanner.nextDouble();
	        System.out.print("Nhập sai số epsilon: ");
	        double epsilon = scanner.nextDouble();

	        double term = x;
	        double sinX = term;
	        int i = 1;

	        while (Math.abs(term) >= epsilon) {
	            term *= -x * x / (2 * i * (2 * i + 1));
	            sinX += term;
	            i++;
	        }

	        System.out.println("Giá trị gần đúng của sin(" + x + ") là: " + sinX);
	    }

	    // In ra màn hình dãy n số Fibonacci
	    public static void baiToan5() {
	    	Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số lượng số Fibonacci cần in ra: ");
	        int n = scanner.nextInt();

	        long f1 = 1, f2 = 1;

	        System.out.print(f1 + " " + f2);

	        for (int i = 3; i <= n; i++) {
	            long fn = f1 + f2;
	            System.out.print(" " + fn);
	            f1 = f2;
	            f2 = fn;
	        }

	        System.out.println();
	    }
	}

