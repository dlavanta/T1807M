package Lab_session2;

import java.util.Scanner;

public class NhanVien {
    String name;
    int age;
    String address;
    double salary;
    int totalTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    NhanVien(){
        System.out.println("vua tao ra 1 doi tuong Nhan vien");
//        inputInfo();
//        printInfo();
    }

    NhanVien(int x){
        System.out.println("vua tao ra 1 doi tuong Nhan vien "+x);
    }

    NhanVien(int y,int x){
        System.out.println("vua tao ra 1 doi tuong Nhan vien "+y+x);
    }

    NhanVien(String name){
        System.out.println("vua tao ra 1 doi tuong Nhan vien ten la "+name);
    }

    void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien:");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi:");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap dia chi:");
        address = scanner.nextLine();
        System.out.println("Nhap luong:");
        salary = scanner.nextDouble();
        System.out.println("nhap thoi gian lam viec:");
        totalTime = scanner.nextInt();
        this.printInfo();
    }

    void printInfo(){
        System.out.println("Ten: "+name+ " tuoi: "+age);
        System.out.println("Dia chi: "+address+ " luong: "+salary+" Thoi gian: "+totalTime);
    }

    double tinhThuong(){
        double thuong = 0;
        if(totalTime >=200){
            thuong = salary*20/100;
        }else if(totalTime<200 && totalTime>=100){
            thuong = salary*10/100;
        }
        return thuong;
    }

    public static void main(String[] args){
        NhanVien nhanVien1 = new NhanVien(5);
        nhanVien1.inputInfo();
        NhanVien nhanVien2 = new NhanVien();
        nhanVien2.inputInfo();
        NhanVien nhanVien3 = new NhanVien("Nam");

        NhanVien nhanVien4 = new NhanVien();


        //System.out.println("Tien thuong: "+nhanVien1.tinhThuong());


    }


}
