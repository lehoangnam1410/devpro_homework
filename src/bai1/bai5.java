package bai1;

import java.util.Scanner;

public class bai5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập chiều dài của hình hộp chữ nhật: ");
    double chieuDai = scanner.nextDouble();

    System.out.print("Nhập chiều rộng của hình hộp chữ nhật: ");
    double chieuRong = scanner.nextDouble();

    System.out.print("Nhập chiều cao của hình hộp chữ nhật: ");
    double chieuCao = scanner.nextDouble();

    double dienTichXungQuanh = 2 * chieuCao * (chieuDai + chieuRong);
    double dienTichToanPhan = 2 * (chieuDai * chieuRong + chieuDai * chieuCao + chieuRong * chieuCao);
    double theTich = chieuDai * chieuRong * chieuCao;

    System.out.println("Diện tích xung quanh: " + dienTichXungQuanh);
    System.out.println("Diện tích toàn phần: " + dienTichToanPhan);
    System.out.println("Thể tích: " + theTich);
}
}
