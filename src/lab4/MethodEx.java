package lab4;

public class MethodEx {
    //1. No return No parameter : คือ เมธอดที่ไม่มีการรับค่าพารามิเตอร์
    // และไม่คืนค่าใดกลับหลังจาด process แล้ว
    //2. No return 1 or parameter : คือ เมธอดทีมีการรับพารามิเตอร์ ตั้งแต่1 หรือมากกว่า
    // และไม่คืนค่าใดกลับหลังจาด process แล้ว
    //3. Return 1value, 1 or more parameter : ือ เมธอดทีมีการรับพารามิเตอร์ ตั้งแต่1 หรือมากกว่า
    //และมีการคืนค่ากลับไปยังส่วนที่เรียกใช้งาน (เรียกใช้งานที่ไหน คืนค่าไปที่นั้น)
    public static void main (String[] args){
        System.out.println("Hello from Main().");
        A();
        A();
        A();
        //calling method B()
        B("MIT", "RUTS");
        //calling method C()
        //1. ประกาศตัวแปรชนิดเดียวกันมาเก็บที่เมธอดส่งกลับมาให้
        int summation = C(10, 20);
        System.out.println("The summation of x and y : "+summation);
        //2. เรียกใช้เมธอดโดยไม่ประกาศตัวแปรใดๆ มาเก็บค่าที่ส่งกลับมา
        System.out.println("The summation of x and y (2): "+C(50, 50));


    } //main

    public static void A() {
        System.out.println("Hello from A().");
    } //A

    public static void B(String msg,String msg2) {
        System.out.println("Hello from B().");
        System.out.println("Message: "+msg);
        System.out.println("Message2: "+msg2);
    } //B
    private  static int C(int x, int y){
        System.out.println("Hello from C().");
        int sum = x + y;
        return sum;
    }

} //class
