package bai1;

import java.util.Scanner;

class HocSinh {
    String hoVaTen;
    String ngaySinh;
    String gioiTinh;
    double diemTB;
    String xepLoaiDaoDuc;

    public HocSinh(String hoVaTen, String ngaySinh, String gioiTinh, double diemTB, String xepLoaiDaoDuc) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
        this.xepLoaiDaoDuc = xepLoaiDaoDuc;
    }
}
public class bai6 {
	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);
     HocSinh[] hocSinhs = new HocSinh[3];

     for (int i = 0; i < 3; i++) {
         System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ":");
         System.out.print("Họ và tên: ");
         String hoVaTen = scanner.nextLine();
         System.out.print("Ngày sinh (dd-MM-yyyy): ");
         String ngaySinh = scanner.nextLine();
         System.out.print("Giới tính: ");
         String gioiTinh = scanner.nextLine();
         System.out.print("Điểm trung bình: ");
         double diemTB = scanner.nextDouble();
         scanner.nextLine(); // clear the newline character
         System.out.print("Xếp loại đạo đức: ");
         String xepLoaiDaoDuc = scanner.nextLine();

         hocSinhs[i] = new HocSinh(hoVaTen, ngaySinh, gioiTinh, diemTB, xepLoaiDaoDuc);
     }

     System.out.println("\nThông tin của 3 học sinh:");
     System.out.printf( "%-5s %-20s %-15s %-10s %-10s %-10s%n","STT", "Họ và tên", "Ngày sinh", "Giới tính", "Điểm TB", "XLĐĐ");
     for (int i = 0; i < 3; i++) {
         HocSinh hs = hocSinhs[i];
         System.out.printf("%-5d %-20s %-15s %-10s %-10.2f %-10s%n", i + 1, hs.hoVaTen, hs.ngaySinh, hs.gioiTinh, hs.diemTB, hs.xepLoaiDaoDuc);
     }
	}
}
