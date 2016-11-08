/**
 * Created by jskonst on 17.10.16.
 */
public class Camera {
    private String brand;
    private String model;
    private int photosCount;

    void takePhoto(){
        System.out.println("Taking a photo");
    }

    void uploadToCloud(){
        System.out.println("Uploading photos");
    }

    void takeVideo(){
        System.out.println("Taking videos");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPhotosCount() {
        return photosCount;
    }

    public void setPhotosCount(int photosCount) {
        this.photosCount = photosCount;
    }
}
