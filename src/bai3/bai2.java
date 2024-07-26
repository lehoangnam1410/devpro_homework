package bai3;
import java.util.Scanner;
import java.lang.Math;
import java.time.YearMonth;
public class bai2 {

	    public static void main(String[] args) {
	        int choice;

	        do {
	            System.out.println("Chọn 1: Thực hiện bài toán 1.");
	            System.out.println("Chọn 2: Thực hiện bài toán 2.");
	            System.out.println("Chọn 3: Thực hiện bài toán 3.");
	            System.out.println("Chọn 4: Thực hiện bài toán 4.");
	            System.out.println("Chọn 0: Thoát khỏi chương trình.");
	            System.out.print("Nhập lựa chọn của bạn: ");
	            Scanner scanner = new Scanner(System.in);
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    baiToan1();
	                    break;
	                case 2:
	                    baiToan2();
	                    break;
	                case 3:
	                    baiToan3();
	                    break;
	                case 4:
	                    baiToan4();
	                    break;
	                case 0:
	                    System.out.println("Thoát chương trình.");
	                    break;
	                default:
	                    System.out.println("Lựa chọn không hợp lệ. Thoát chương trình.");
	                    choice = 0;
	                    break;
	            }
	        } while (choice != 0);
	    }

	    public static void baiToan1() {
	        System.out.print("Nhập 1 chữ số (0-9): ");
	        Scanner scanner = new Scanner(System.in);
	        int d = scanner.nextInt();

	        switch (d) {
	            case 0:
	                System.out.println("Số không");
	                break;
	            case 1:
	                System.out.println("Số một");
	                break;
	            case 2:
	                System.out.println("Số hai");
	                break;
	            case 3:
	                System.out.println("Số ba");
	                break;
	            case 4:
	                System.out.println("Số bốn");
	                break;
	            case 5:
	                System.out.println("Số năm");
	                break;
	            case 6:
	                System.out.println("Số sáu");
	                break;
	            case 7:
	                System.out.println("Số bảy");
	                break;
	            case 8:
	                System.out.println("Số tám");
	                break;
	            case 9:
	                System.out.println("Số chín");
	                break;
	            default:
	                System.out.println("Không phải là một chữ số hợp lệ");
	                break;
	        }
	    }

	    public static void baiToan2() {
	        System.out.print("Nhập giá trị x: ");
	        Scanner scanner = new Scanner(System.in);
	        double x = scanner.nextDouble();
	        double y;

	        if (x > 2 && x < 3) {
	            y = 5 * Math.cos(3 * x + 2) - Math.log(x * x + 2);
	        } else if (x >= 3) {
	            y = Math.pow(x + 3, 2);
	        } else {
	            y = 1;
	        }

	        System.out.println("Giá trị của y là: " + y);
	    }

	    public static void baiToan3() {
	        System.out.print("Nhập số kg gạo: ");
	        Scanner scanner = new Scanner(System.in);
	        double m = scanner.nextDouble();
	        double cost = 0;

	        if (m <= 50) {
	            cost = m * 14000;
	        } else {
	            cost = 50 * 14000;
	            m -= 50;
	            if (m <= 25) {
	                cost += m * (14000 - 500);
	            } else {
	                cost += 25 * (14000 - 500);
	                m -= 25;
	                if (m <= 15) {
	                    cost += m * (14000 - 750);
	                } else {
	                    cost += 15 * (14000 - 750);
	                    m -= 15;
	                    if (m <= 15) {
	                        cost += m * (14000 - 1000);
	                    } else {
	                        cost += 15 * (14000 - 1000);
	                        m -= 15;
	                        cost += m * (14000 - 1500);
	                    }
	                }
	            }
	        }
	        System.out.println("Tổng số tiền phải trả: " + cost);
	    }

	    public static void baiToan4() {
	    	 Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập tọa độ điểm A (ax, ay): ");
	        double ax = scanner.nextDouble();
	        double ay = scanner.nextDouble();
	        System.out.print("Nhập tọa độ điểm B (bx, by): ");
	        double bx = scanner.nextDouble();
	        double by = scanner.nextDouble();
	        System.out.print("Nhập tọa độ điểm C (cx, cy): ");
	        double cx = scanner.nextDouble();
	        double cy = scanner.nextDouble();

	        double AB = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
	        double BC = Math.sqrt(Math.pow(cx - bx, 2) + Math.pow(cy - by, 2));
	        double CA = Math.sqrt(Math.pow(ax - cx, 2) + Math.pow(ay - cy, 2));

	        System.out.println("Độ dài cạnh AB: " + AB);
	        System.out.println("Độ dài cạnh BC: " + BC);
	        System.out.println("Độ dài cạnh CA: " + CA);

	        if (AB + BC == CA || AB + CA == BC || BC + CA == AB) {
	            System.out.println("Ba điểm thẳng hàng");
	        } else {
	            double chuVi = AB + BC + CA;
	            double p = chuVi / 2;
	            double dienTich = Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
	            double banKinhNgoaiTiep = (AB * BC * CA) / (4 * dienTich);

	            System.out.println("Chu vi: " + chuVi);
	            System.out.println("Diện tích: " + dienTich);
	            System.out.println("Bán kính đường tròn ngoại tiếp: " + banKinhNgoaiTiep);
	        }
	    }
	}

