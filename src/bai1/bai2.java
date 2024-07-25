package bai1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập bán kính
        System.out.print("Nhập bán kính của hình tròn: ");
        double banKinh = sc.nextDouble();

        // Tính chu vi và diện tích của hình tròn
        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * Math.pow(banKinh, 2);

        // Hiển thị kết quả
        System.out.println("Chu vi của hình tròn là: " + chuVi);
        System.out.println("Diện tích của hình tròn là: " + dienTich);

    }
}