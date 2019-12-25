package lab3;

import java.util.Scanner;

public class ExerciselLab3 {
    public static void main(String[] args) {
        //if-else

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number 1:");
        double num1 = sc.nextDouble();
        System.out.println("Enter an number 2:");
        double num2 = sc.nextDouble();

        //test conditon

        if (num1 > num1 ){
            System.out.println(num1+ "more than "+num2);
        }else{
            System.out.println(num1+ "less than "+num2);
        }
    }
}
