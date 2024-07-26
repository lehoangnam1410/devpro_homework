package bai2;

import java.util.ArrayList;
import java.util.Scanner;

class MonHoc{
	private String maMonHoc;
	private String tenMonHoc;
	private int heSo;
	private int diemSo;
	public MonHoc() {
		
	}
	public MonHoc(String maMonHoc, String tenMonHoc, int heSo, int diemSo) {
		this.maMonHoc = maMonHoc;
		this.tenMonHoc = tenMonHoc;
		this.heSo = heSo;
		this.diemSo = diemSo;
	}
	
	public String getMaMonHoc() {
		return maMonHoc;
	}
	public String getTenMonHoc() {
		return tenMonHoc;
	}
	public int getHeSo() {
		return heSo;
	}
	public int getDiemSo() {
		return diemSo;
	}
	public void nhapThongTinMonHoc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã môn học");
		this.maMonHoc = sc.nextLine();
		System.out.println("Nhập tên môn học");
		this.tenMonHoc= sc.nextLine();
		System.out.println("Nhập hệ số");
		this.heSo= sc.nextInt();
		System.out.println("Nhập điểm số");
		this.diemSo= sc.nextInt();
		System.out.println();
	}
	public void hienThiMonHoc() {
		System.out.println("Mã môn học"+maMonHoc);
		System.out.println("Tên môn học"+tenMonHoc);
		System.out.println("Hệ Số"+heSo);
		System.out.println("Điểm Số"+diemSo);
	}
	
}
class SinhVien{
	private String maSinhVien;
    private String hoDem;
    private String ten;
    private String ngaySinh;
    private ArrayList<MonHoc> danhSachMonHoc;

    public SinhVien() {
        danhSachMonHoc = new ArrayList<>();
    }

    public SinhVien(String maSinhVien, String hoDem, String ten, String ngaySinh, ArrayList<MonHoc> danhSachMonHoc) {
        this.maSinhVien = maSinhVien;
        this.hoDem = hoDem;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.danhSachMonHoc = danhSachMonHoc;
    }

    public void nhapThongTinSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        this.maSinhVien = sc.nextLine();
        System.out.print("Nhập họ đệm: ");
        this.hoDem = sc.nextLine();
        System.out.print("Nhập tên: ");
        this.ten = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        this.ngaySinh = sc.nextLine();

        System.out.println("Nhập thông tin 5 môn học:");
        for (int i = 0; i < 5; i++) {
            MonHoc monHoc = new MonHoc();
            monHoc.nhapThongTinMonHoc();
            danhSachMonHoc.add(monHoc);
        }
    }

    public void hienThiSinhVien() {
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Họ đệm: " + hoDem);
        System.out.println("Tên: " + ten);
        System.out.println("Ngày sinh: " + ngaySinh);
        for (MonHoc monHoc : danhSachMonHoc) {
            monHoc.hienThiMonHoc();
        }
        System.out.println("Điểm trung bình: " + tinhDiemTrungBinh());
    }

    public float tinhDiemTrungBinh() {
        float tongDiem = 0;
        int tongHeSo = 0;
        for (MonHoc monHoc : danhSachMonHoc) {
            tongDiem += monHoc.getDiemSo() * monHoc.getHeSo();
            tongHeSo += monHoc.getHeSo();
        }
        return tongDiem / tongHeSo;
    }
}
public class bai3 {
public static void main(String[] args) {
	SinhVien sinhVien = new SinhVien();
    sinhVien.nhapThongTinSinhVien();
    sinhVien.hienThiSinhVien();
}
}
