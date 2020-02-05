package lab8;

public class PersonApp {

    public static void main(String[] args) {
        //create object
        Student std1 = new Student("1809900853552","sudarat krodsrimai", "std002",
                "Information Technology");
        Person p1 = new Person("222222222222", "Zee Zee");

        System.out.println(std1.getName());
        System.out.println(p1.getName());

    }
}
