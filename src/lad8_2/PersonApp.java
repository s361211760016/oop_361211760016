package lad8_2;

public class PersonApp {
    public static void main(String[] args) {

        //create objects
        Person P1 = new Person("sudarat krodsrimai","1997");
        Person P2 = new Sheriff("aomsin makkern","1998",
                "Thunsong");
        Person P3 = new Police("rattanawalee sakunnoo","1996",
                "Nakhon");

        P1.introduce();
        P2.introduce();
        P3.introduce();
    }
}
