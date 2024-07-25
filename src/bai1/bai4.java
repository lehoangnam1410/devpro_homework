package bai1;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập độ dài cạnh a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập độ dài cạnh b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập độ dài cạnh c: ");
        double c = sc.nextDouble();
        double chuVi = a + b + c;
        double p = (a + b + c)/2;
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Chu vi của tam giác là: " + chuVi);
        System.out.println("Diện tích của tam giác là: " + dienTich);
        
	}
}
