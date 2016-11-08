public class Demo {

    public static void main(String[] args) {
        Camera cam = new Camera();
        cam.setPhotosCount(20);
        System.out.println(cam.getPhotosCount());


        int a = 3;
        int b = 3;
        if (a == 0) {

        }
        System.out.println("a before=" + a);
        System.out.println("b before=" + b);
        Demo d = new Demo();
        d.summ(a, b);
        System.out.println("a after=" + a);
        System.out.println("b after=" + b);

    }

    int summ(int a, int b) {
        int c = a + b;
        return c;
    }

    int mul(int a, int b) {
        int c = a * b;
        return c;
    }
}


