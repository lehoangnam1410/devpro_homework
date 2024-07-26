package bai2;

import java.util.Scanner;

class HangHoa {
    String tenHang;
    int soLuong;
    double donGia;
    public HangHoa() {}
    public HangHoa(String tenHang, int soLuong, double donGia) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    double tinhThanhTien() {
        return this.soLuong * this.donGia;
    }

    void hienThiThongTin() {
        System.out.println("Tên hàng: " + this.tenHang);
        System.out.println("Số lượng: " + this.soLuong);
        System.out.println("Đơn giá: " + this.donGia);
        System.out.println("Thành tiền: " + tinhThanhTien());
    }
    void nhapThongTin() {
    	Scanner scanner = new Scanner(System.in);
    	  System.out.print("Tên hàng: ");
          tenHang = scanner.nextLine();
          System.out.print("Số lượng: ");
          soLuong = scanner.nextInt();
          System.out.print("Đơn giá: ");
          donGia = scanner.nextDouble();
    	
    }
}

class HoaDon {
    String soHoaDon;
    String tenKhachHang;
    String ngayMuaHang;
    HangHoa[] danhSachHangHoa = new HangHoa[5];

    HoaDon(String soHoaDon, String tenKhachHang, String ngayMuaHang) {
        this.soHoaDon = soHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.ngayMuaHang = ngayMuaHang;
    }

    void nhapHangHoa() {
    	Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < danhSachHangHoa.length; i++) {
            System.out.println("Nhập thông tin hàng hóa thứ " + (i + 1) + ":");
            danhSachHangHoa[i] = new HangHoa();
            danhSachHangHoa[i].nhapThongTin();
        }
    }

    void hienThiHoaDon() {
        double tongTien = 0;
        System.out.println("Số hóa đơn: " + this.soHoaDon);
        System.out.println("Tên khách hàng: " + this.tenKhachHang);
        System.out.println("Ngày mua hàng: " + this.ngayMuaHang);
        for (HangHoa hangHoa : danhSachHangHoa) {
            hangHoa.hienThiThongTin();
            tongTien += hangHoa.tinhThanhTien();
        }
        double tienSauThue = tongTien * 1.1; 
        System.out.println("Tổng tiền hàng: " + tongTien);
        System.out.println("Tiền phải trả sau thuế: " + tienSauThue);
    }
}
public class bai4 {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     System.out.print("Nhập số hóa đơn: ");
     String soHoaDon = scanner.next();
     System.out.print("Nhập tên khách hàng: ");
     String tenKhachHang = scanner.next();
     System.out.print("Nhập ngày mua hàng: ");
     String ngayMuaHang = scanner.next();

     HoaDon hoaDon = new HoaDon(soHoaDon, tenKhachHang, ngayMuaHang);
     hoaDon.nhapHangHoa();
     hoaDon.hienThiHoaDon();
}
}
