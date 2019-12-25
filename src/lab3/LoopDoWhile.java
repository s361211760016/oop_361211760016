package lab3;

import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        //Do-while -> ทำงานเช่นเดียวกับ while แต่จะทำคำสั่งในลูปก่อน 1 ครั้งเสมอจึงทดสอบเงื่อนไขก
        //ดั้งนั้นจะหมายความว่า ไม่ว่าเขื่อนไขจะเป็นจริงหรือเท็จ คำสั้งในลูปจะถูกทำงานแล้วอย่างน้อย 1 ครั้ง

        //do{
        //    คำสั่งเงือนไขเป็นจริง;
        //} while(เงือนไข);

        Scanner sc =new Scanner(System.in);
        int x= 1;
        do {
            System.out.println("enter an number: ");
            x = sc.nextInt();
        }while (x !=0);
        System.out.println("Good bye.");
        }
    }
