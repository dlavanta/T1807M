package Session1;

public class Demo {
    int age;
    static int  abc = 100;
    final static int xyz = 50;

    public static void main(String[] args){
        int x = 100;
        System.out.println("Hello T1807M");
        plus();
        Demo mainObject;
        mainObject = new Demo();

        System.out.println(mainObject.age);
        System.out.println(Demo.abc);
        Demo.abc = 20;
        System.out.println(Demo.abc);
        System.out.println(Demo.xyz);
    }

    public static void plus(){
        int x  = 10;
        int y = 20;
        System.out.println(x+y);
    }

}
