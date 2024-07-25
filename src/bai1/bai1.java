package bai1;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Double x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập độ dài 2 đáy");
		x= sc.nextDouble();
		y = sc.nextDouble();
		System.out.println("nhập độ dài chiều cao");
		z = sc.nextDouble();
		System.out.println("S = "+((x+y)*z/2));
	}
}
