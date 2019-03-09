package Session1;

import Session2.*;

import java.util.Scanner;

public class Demo {
    int age;
    static int  abc = 100;
    final static int xyz = 50;

    public static void main(String[] args){
        int x = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap 1 so:");
        int x1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("nhap 1 chuoi:");
        String s1 = scanner.nextLine();


        System.out.println("Hello T1807M");
        plus();
        Demo mainObject;
        mainObject = new Demo();

        System.out.println(mainObject.age);
        System.out.println(Demo.abc);
        Demo.abc = 20;
        System.out.println(Demo.abc);
        System.out.println(Demo.xyz);

        Thu7 thu7 = new Thu7();
        thu7.name = "thu 7";
        thu7.number = 7;
        thu7.showName();
        thu7.showNextday(6);
        Thu7.staticMethod();
    }

    public static void plus(){
        int x  = 10;
        int y = 20;
        System.out.println(x+y);
    }

}
