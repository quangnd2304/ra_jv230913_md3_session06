package ra;

import java.util.Scanner;

public class Student {
    //1. Fields/Attributes/Properties - Thuộc tính thể hiện đặc điểm của đối tượng
    //Mã sinh viên, tên sinh viên, tuổi, giới tính, phone, email, địa chỉ
    //private Datatype fieldName: 0-N thuộc tính --> thể hiện tính bao đóng trong OOP
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String phone;
    private String email;
    private String address;

    //2. Constructors - Hàm tạo để khởi tạo đối tượng từ lớp
    //public ClassName (params): 0-N hàm tạo
    //param: datatype paramName
    //2.1. Tạo constructor không có tham số (default Constructor) --> khi khởi tạo đối tượng ko
    //khởi tạo bất cứ thông tin gì của đối tượng
    //Overloading
    public Student() {
    }

    //2.2.  Tạo constructor có 2 tham số --> khởi tạo đối tượng khởi tạo mã sinh viên và tên sinh viên
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    //2.3. Tạo constructor gồm các tham số --> khởi tạo đối tượng khởi tạo tất cả thông tin của đối tượng
    public Student(String studentId, String studentName, int age, boolean sex, String phone, String email, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    //3. Methods - Phương thức thể hiện hành vi của đối tượng
    //Access Modifier + Return Data + Method Name + (params){ Block Statements;}: 0 - N phương thức
    //3.1. Getter/Setter
    public String getStudentId() {
        //Cài đặt các bộ lọc (điều kiện) để có thể lấy dữ liệu
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        //Cài đặt các bộ lọc (điều kiện) để có thể gán dữ liệu
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //3.2. Các phương thức bình thường thể hiện hành vi
    public void hello() {
        System.out.println("Xin chào");
    }

    public int add(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public int getYear() {
        return 2024 - this.age;
    }

    //Phương thức cho phép nhập thông tin sinh viên
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào số điện thoại:");
        this.phone = scanner.nextLine();
        System.out.println("Nhập vào email:");
        this.email = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ:");
        this.address = scanner.nextLine();
    }

    //Phương thức cho phép in thông tin của đối tượng
    public void displayData() {
        System.out.printf("Mã SV: %s - Tên SV: %s - Tuổi: %d - Giới tính: %b\n",
                this.studentId, this.studentName, this.age, this.sex);
        System.out.printf("Điện thoại: %s - Email: %s - Địa chỉ: %s\n",
                this.phone, this.email, this.address);
    }
}
