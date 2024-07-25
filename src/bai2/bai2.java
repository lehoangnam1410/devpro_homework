package bai2;

import java.util.Scanner;

class CongDan{
	private String soTheCanCuoc;
	private String hoDem;
	private String ten;
	private String ngaySinh;
	private String gioiTinh;
	private String diaChi;
	private String dienThoai;
	public CongDan() {}
	public CongDan(String soTheCanCuoc, String hoDem, String ten, String ngaySinh, String gioiTinh, String diaChi,
			String dienThoai) {
		this.soTheCanCuoc = soTheCanCuoc;
		this.hoDem = hoDem;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
	}
	public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thẻ căn cước: ");
        soTheCanCuoc = scanner.nextLine();
        System.out.print("Nhập họ đệm: ");
        hoDem = scanner.nextLine();
        System.out.print("Nhập tên: ");
        ten = scanner.nextLine();
        System.out.print("Nhập ngày sinh (YYYY-MM-DD): ");
        ngaySinh = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhập điện thoại: ");
        dienThoai = scanner.nextLine();
    }

    // Hàm hiển thị thông tin công dân
    public void hienThiThongTin() {
        System.out.println("Số thẻ căn cước: " + soTheCanCuoc);
        System.out.println("Họ đệm: " + hoDem);
        System.out.println("Tên: " + ten);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Điện thoại: " + dienThoai);
        System.out.println();
    }
}
public class bai2 {
public static void main(String[] args) {
	CongDan[] danhSachCongDan = new CongDan[3];
	for(int i=0;i<3;i++) {
		//danhSachCongDan[i] = new CongDan();
		danhSachCongDan[i].nhapThongTin();
		System.out.println();
	}
	for(int i=0;i<3;i++) {
		danhSachCongDan[i].hienThiThongTin();
	}
}
}
