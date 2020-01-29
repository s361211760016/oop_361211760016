package lab6;

import java.util.StringTokenizer;

public class exStringBuffer {
    public static void main(String[] args) {

        //StringBuffer เป็นคลาส ที่มีเมธอดต่างๆ
        //ที่มารถปรับปรุงแก้ไขข้อมูลเป็น String ได้มากกว่าลาส String ทั่วไป

        StringBuffer strBuf = new StringBuffer("Hello");
        System.out.println(strBuf);
        //append() ใช้สำหรับต่อ String
        strBuf.append("Saiyai");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.delete(0,6);
        System.out.println(strBuf);

        //StringTokenixer
        String s = "A video showing an Asian-American woman’ cooking rice has upset some Thai people. In the  video," +
                " the woman is shown to be frying Thai jasmine rice in a wok on high heat, which";
        StringTokenizer tokenizer = new StringTokenizer(s);
        int countWord = tokenizer.countTokens();
        System.out.println("Word cont from message:"+countWord);

        //word cutting
        while (tokenizer.hasMoreTokens()){
           System.out.println(tokenizer.nextToken());
        }



    }//main
}//class