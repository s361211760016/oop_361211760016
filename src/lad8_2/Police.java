package lad8_2;

public class Police extends Person {
    public String worCountry;

    public Police(String name, String dataOfBirth,String worCountry) {
        super(name, dataOfBirth);
        this.worCountry = worCountry;

    }
    public void introduce(){
        super.introduce();
        System.out.println("I wore ar"+this.worCountry);
    }
    ////getter and setter

    public String getWorCountry() {
        return worCountry;
    }

    public void setWorCountry(String worCountry) {
        this.worCountry = worCountry;
    }
    //toString

    @Override
    public String toString() {
        return "Police{" +
                "worCountry='" + worCountry + '\'' +
                "} " + super.toString();
    }
}
