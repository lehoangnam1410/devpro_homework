package bai3;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Giải bài tập 1");
			System.out.println("2. Giải bài tập 2");
			System.out.println("3. Giải bài tập 3");
			System.out.println("4. Giải bài tập 4");
			System.out.println("0. Thoát chương trình");
			
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				baiToan1();
				break;
			}
			case 2:{
				baiToan2();
				break;
			}
			case 3:{
				baiToan3();
				break;
			}
			case 4:{
				baiToan4();
				break;
			}
			case 0:{
				break;
			}
			default: System.out.println("thoát chương trình");
			 choice = 0;
             break;
			}
		}
		while(choice!=0);
	 
	}
	public static void baiToan1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập số n:");
		int n = scanner.nextInt();
		int result =1;
		for(int i=1;i<=n;i++) {
			result *= i;
		}
		System.out.println("n!="+result);
		
	}
	private static void baiToan2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập số n:");
		int n = scanner.nextInt();
		int m =0,temp ;
		while(n!=0) {
			temp = n%10;
			m += m*10 + temp;
			n =n/10;
			
		}
		System.out.println("Số m :"+m);
	}
	private static void baiToan3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập tử số:");
	}
	private static void baiToan4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập tử số:");
		System.out.println("nhập mẫu số:");
		
	}
	public static int timGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
