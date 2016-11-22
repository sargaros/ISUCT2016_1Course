/**
 * Created by stud_6 on 17.10.16.
 */
public class Airplane {
    private String model;
    private String brand;
    private int passengersCount;

    void  takepassenger() {
        System.out.print("Taking a passenger");
    }
    void uploadCould() {
        System.out.print("upload passengers");
    }

    void takeage() {
        System.out.print(("Taking a age"));


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }
}

