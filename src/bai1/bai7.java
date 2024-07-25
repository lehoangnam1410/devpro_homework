package bai1;

import java.util.Scanner;

class canBo{
	private String maCanBo;
	private String hoVaTen;
	private String ngaySinh;
	private int soNgayLamViec;
	private int soGioLamThem;
	
	public canBo(String maCanBo, String hoVaTen, String ngaySinh, int soNgayLamViec, int soGioLamThem) {
		this.maCanBo = maCanBo;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.soNgayLamViec = soNgayLamViec;
		this.soGioLamThem = soGioLamThem;
	}
	public double tinhLuong() {
        return this.soNgayLamViec * 350000 + this.soGioLamThem * 45000;
    }

    public void hienThiThongTin() {
        System.out.printf("%-15s %-20s %-15s %-15d %-15d %-15.2f\n", 
            this.maCanBo, this.hoVaTen, this.ngaySinh, this.soNgayLamViec, this.soGioLamThem, this.tinhLuong());
    }

	
}
public class bai7 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	canBo[] danhSachCanBo  = new canBo[3];

	for(int i=0;i<3;i++) {
		System.out.println("Nhập mã cán bộ");
		String ma = scanner.nextLine();
		System.out.println("Nhập họ và tên");
		String hoten = scanner.nextLine();
		System.out.println("Nhập ngày sinh");
		String ngaysinh = scanner.nextLine();
		System.out.println("Nhập số ngày làm việc trong tháng");
		int songaylamviec = scanner.nextInt();
		System.out.println("Số giờ làm thêm");
		int sogiolamthem = scanner.nextInt();
		scanner.nextLine();
		danhSachCanBo[i] = new canBo(ma, hoten, ngaysinh, songaylamviec, sogiolamthem);
		
	}
	System.out.println("\nThông tin các cán bộ:");
    System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", 
        "Mã cán bộ", "Họ và tên", "Ngày sinh", "Số ngày LV", "Giờ làm thêm", "Lương");

    double tongLuong = 0;
    for (canBo canBo : danhSachCanBo) {
        canBo.hienThiThongTin();
        tongLuong += canBo.tinhLuong();
    }

    System.out.printf("\nTổng lương: %.2f\n", tongLuong);
}
}
