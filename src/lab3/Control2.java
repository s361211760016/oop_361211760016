package lab3;

import java.util.Scanner;

public class Control2 {
    public static void main(String[] args){
        //if-else -> เป็นคำสั้งที่เลือกทำอย่างไรอย่างหนึ่ง
        //โครงสร้างคำสั้ง if-else
        // if (เป็นเงื่อนไข){
        //  คำสั้งของ if เมื่อเงื่อนไขเป็นจริง;
        // }else{
        //   คำสั้งของ if เมื่อเงื่อนไขเป็นเท็จ;
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("How old you? : ");
        int age = sc.nextInt();
        if (age > 60){
            System.out.println("You are old (คุณแก่แล้ว).");
        }else {
            System.out.println("You are not old yet. (คุณยังไม่แก่) ");
        }
    }

}
