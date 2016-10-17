/**
 * Created by jskonst on 17.10.16.
 */
public class Camera {
    String brand;
    String model;
    int photosCount;

    void takePhoto(){
        System.out.println("Taking a photo");
    }

    void uploadToCloud(){
        System.out.println("Uploading photos");
    }

    void takeVideo(){
        System.out.println("Taking videos");
    }
}
