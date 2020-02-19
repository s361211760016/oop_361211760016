package lad8_2;

public class Sheriff extends Person {
    private String workSate;

    public Sheriff(String name, String dataOfBirth,String workSate) {
        super(name, dataOfBirth);
        this.workSate = workSate;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I wore ar"+this.workSate);
    }
    //getter and setter

    public String getWorkSate() {
        return workSate;
    }

    public void setWorkSate(String workSate) {
        this.workSate = workSate;
    }
    //toString

    @Override
    public String toString() {
        return "Sheriff{" +
                "workSate='" + workSate + '\'' +
                "} " + super.toString();
    }
}
