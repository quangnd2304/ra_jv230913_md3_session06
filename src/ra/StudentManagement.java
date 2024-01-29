package ra;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        //Cú pháp khởi tạo đối tượng: ClassName objectName = new Constructor(arguments)
        //1. Khởi tạo đối tượng sinh viên student1 mà ko khởi tạo thông tin gì của sinh viên
        Student student1 = new Student();
        //2. Khởi tạo đối tượng sinh viên student2 và khởi tạo mã sinh viên và tên sinh viên
        Student student2 = new Student("SV002", "Nguyễn Văn B");
        //3. Khởi tạo đối tượng sinh viên student3 và khởi tạo tất cả thông tin sinh viên
        Student student3 = new Student("SV003", "Nguyễn Văn C", 25, true
                , "0123456789", "cnv@gmail.com", "TP HCM");
        //In ra tên sinh viên 2
        System.out.println("Tên sinh viên 2: " + student2.getStudentName());
        //Nhập dữ liệu cho sinh viên 1
        System.out.println("NHẬP DỮ LIỆU SINH VIÊN 1:");
        Scanner scanner = new Scanner(System.in);
        student1.inputData(scanner);
        //Nhập các thông tin còn lại của sinh viên 2
        System.out.println("NHẬP THÔNG TIN SINH VIÊN 2:");
        System.out.println("Nhập vào tuổi sinh viên 2:");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào giới tính sinh viên 2:");
        student2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập vào số điện thoại của sinh viên 2:");
        student2.setPhone(scanner.nextLine());
        System.out.println("Nhập vào email của sinh viên 2:");
        student2.setEmail(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ của sinh viên 2:");
        student2.setAddress(scanner.nextLine());
        //Cho sinh viên 3 tính tổng 2 số 10 và 20
        int sum = student2.add(10, 20);
        System.out.println("Tổng 2 số là: " + sum);
        //In thông tin sinh viên
        System.out.println("THÔNG TIN SINH VIÊN 1:");
        student1.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 2:");
        student2.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 3:");
        student3.displayData();
    }
}
