/**
 * Created by stud_6 on 17.10.16.
 */
public class Computer {
    public int getVolume() {
        return volume;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private String brand;
   private String model;
   private int volume;

    void volume() {
        System.out.println(volume);
    }

    void color() {
        System.out.println("get color");
    }

    void weight() {
        System.out.println("weight colour");
    }
}








