import sun.security.action.LoadLibraryAction;

/**
 * Created by stud_6 on 17.10.16.
 */
public class CatTest {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.Age = 5;
        c.name = "los";
        c.color = "black";
        c.V();
        Cat[] catMassive;
        catMassive = new Cat[3];
        catMassive[0] = new Cat();
        catMassive[1] = new Cat();
        catMassive[2] = new Cat();
        catMassive[0].Age =c.Age;
        catMassive[1].Age =3;
        catMassive[2].Age =4;

        System.out.println(catMassive[1].Age);
    }


}
