package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class monThi{
	private String maMonThi;
	private String tenMonThi;
	private int heSoMon;
	private int diemMonThi;
	public monThi(String maMonThi, String tenMonThi, int heSoMon, int diemMonThi) {
		this.maMonThi = maMonThi;
		this.tenMonThi = tenMonThi;
		this.heSoMon = heSoMon;
		this.diemMonThi = diemMonThi;
	}
	public double tinhDiemTheoHeSo() {
        return diemMonThi * heSoMon;
    }
	public String getMaMonThi() {
		return maMonThi;
	}
	public void setMaMonThi(String maMonThi) {
		this.maMonThi = maMonThi;
	}
	public String getTenMonThi() {
		return tenMonThi;
	}
	public void setTenMonThi(String tenMonThi) {
		this.tenMonThi = tenMonThi;
	}
	public int getHeSoMon() {
		return heSoMon;
	}
	public void setHeSoMon(int heSoMon) {
		this.heSoMon = heSoMon;
	}
	public int getDiemMonThi() {
		return diemMonThi;
	}
	public void setDiemMonThi(int diemMonThi) {
		this.diemMonThi = diemMonThi;
	}
	
}
class ThiSinh {
    private String maThiSinh;
    private String hoDem;
    private String ten;
    private String ngaySinh;
    private ArrayList<monThi> cacMonThi; 

    public ThiSinh(String maThiSinh, String hoDem, String ten, String ngaySinh, ArrayList<monThi> cacMonThi) {
        this.maThiSinh = maThiSinh;
        this.hoDem = hoDem;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.cacMonThi = cacMonThi;
    }

    public double tinhTongDiem() {
        double tongDiem = 0;
        for (monThi mon : cacMonThi) {
            tongDiem += mon.tinhDiemTheoHeSo();
        }
        return tongDiem;
    }

    public void hienThiThongTin() {
        StringBuilder tenCacMon = new StringBuilder();
        for (monThi mon : cacMonThi) {
            tenCacMon.append(mon.getTenMonThi()).append(", ");
        }
        // Remove the last comma and space
        if (tenCacMon.length() > 0) {
            tenCacMon.setLength(tenCacMon.length() - 2);
        }
        System.out.printf("%-15s %-20s %-15s %-30s %-10.2f\n", 
            this.maThiSinh, this.hoDem + " " + this.ten, this.ngaySinh, tenCacMon.toString(), this.tinhTongDiem());
    }
public class bai8 {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     ArrayList<ThiSinh> danhSachThiSinh = new ArrayList<>();

     for (int i = 0; i < 3; i++) {
         System.out.println("Nhập thông tin cho thí sinh thứ " + (i + 1) + ":");
         System.out.print("Số báo danh: ");
         String maThiSinh = scanner.nextLine();
         System.out.print("Họ đệm: ");
         String hoDem = scanner.nextLine();
         System.out.print("Tên: ");
         String ten = scanner.nextLine();
         System.out.print("Ngày sinh (dd/MM/yyyy): ");
         String ngaySinh = scanner.nextLine();

         ArrayList<monThi> cacMonThi = new ArrayList<>();
         for (int j = 0; j < 3; j++) {
             System.out.println("Nhập thông tin môn thi thứ " + (j + 1) + ":");
             System.out.print("Mã môn: ");
             String maMon = scanner.nextLine();
             System.out.print("Tên môn: ");
             String tenMon = scanner.nextLine();
             System.out.print("Hệ số môn: ");
             int heSoMon = scanner.nextInt();
             System.out.print("Điểm môn: ");
             int diemMon = scanner.nextInt();
             scanner.nextLine(); // Clear the buffer

             cacMonThi.add(new monThi(maMon, tenMon, heSoMon, diemMon));
         }

         danhSachThiSinh.add(new ThiSinh(maThiSinh, hoDem, ten, ngaySinh, cacMonThi));
     }

     System.out.println("\nThông tin các thí sinh:");
     System.out.printf("%-15s %-20s %-15s %-30s %-10s\n", 
         "Số báo danh", "Họ và tên", "Ngày sinh", "Môn thi", "Tổng điểm");

     for (ThiSinh thiSinh : danhSachThiSinh) {
         thiSinh.hienThiThongTin();
     }
	}
	}
}
