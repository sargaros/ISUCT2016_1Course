public class Demo {

    public static void main(String[] args) {
        Camera cam = new Camera();
        cam.brand = "Nikon";
        cam.model = "a300000";
        cam.photosCount = 10000;
        cam.takePhoto();
        cam.takeVideo();
        cam.uploadToCloud();

    }
}


