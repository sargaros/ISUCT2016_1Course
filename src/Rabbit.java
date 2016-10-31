/**
 * Created by stud_6 on 17.10.16.
 */
public class Rabbit {
    private int Age;

    public void setAge(int age) {
        Age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    private String name;
  private String weight;

    void run() {
        System.out.println("I r2un");
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }
}
