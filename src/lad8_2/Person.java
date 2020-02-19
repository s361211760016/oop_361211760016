package lad8_2;

public class Person {
    private String name;
    private String dataOfBirth;

    public Person(String name, String dataOfBirth) {
        this.name = name;
        this.dataOfBirth = dataOfBirth;
    }
    public void introduce(){
        System.out.println("My name is"+this.name);
        System.out.println("I was bron in " +this.dataOfBirth);

    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }
    //toString


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                '}';
    }
}
