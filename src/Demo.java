public class Demo {

    public static void main(String[] args) {
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                System.out.println("Less than 5");
            } else {
                if (i == 5) {
                    System.out.println("Equal to 5");
                } else {
                    System.out.println("More than 5");
                }
            }
        }
    }
}


