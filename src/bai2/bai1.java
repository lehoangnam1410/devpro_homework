package bai2;

import java.util.Scanner;

class HocSinh {
	private String maHocSinh;
	private String hoDem;
	private String ten;
	private String ngaySinh;
	private String gioiTinh;
	private double diemToan;
    private double diemVan;
    private double diemAnh;
	public HocSinh(String maHocSinh, String hoDem, String ten, String ngaySinh, String gioiTinh, double diemToan,
			double diemVan, double diemAnh) {
		this.maHocSinh = maHocSinh;
		this.hoDem = hoDem;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemAnh = diemAnh;
	}
	public double tinhDiemTrungBinh() {
		return (2*diemToan+2*diemVan+diemAnh)/5;
	}
	public void hienThiThongTin() {
        System.out.println("Ma hoc sinh: " + maHocSinh);
        System.out.println("Ho dem: " + hoDem);
        System.out.println("Ten: " + ten);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Diem Toan: " + diemToan);
        System.out.println("Diem Van: " + diemVan);
        System.out.println("Diem Anh: " + diemAnh);
        System.out.println("Diem trung binh: " + tinhDiemTrungBinh());
    }
}
public class bai1 {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     System.out.println("Nhap ma hoc sinh: ");
     String maHocSinh = scanner.nextLine();

     System.out.println("Nhap ho dem: ");
     String hoDem = scanner.nextLine();

     System.out.println("Nhap ten: ");
     String ten = scanner.nextLine();

     System.out.println("Nhap ngay sinh: ");
     String ngaySinh = scanner.nextLine();

     System.out.println("Nhap gioi tinh: ");
     String gioiTinh = scanner.nextLine();

     System.out.println("Nhap diem Toan: ");
     double diemToan = scanner.nextDouble();

     System.out.println("Nhap diem Van: ");
     double diemVan = scanner.nextDouble();

     System.out.println("Nhap diem Anh: ");
     double diemAnh = scanner.nextDouble();

     HocSinh hocSinh = new HocSinh(maHocSinh, hoDem, ten, ngaySinh, gioiTinh, diemToan, diemVan, diemAnh);

     hocSinh.hienThiThongTin();
}
}
