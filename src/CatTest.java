import sun.security.action.LoadLibraryAction;

/**
 * Created by stud_6 on 17.10.16.
 */
public class CatTest {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setAge(5);
        c.setName("los");
        c.setName("black");
        c.V();
        Cat[] catMassive;
        catMassive = new Cat[3];
        catMassive[0] = new Cat();
        catMassive[1] = new Cat();
        catMassive[2] = new Cat();
        catMassive[0].setAge(1);
        catMassive[1].setAge(2);
        catMassive[2].setAge(4);

        for (int x=0; x<3; x=x+1 ) {System.out.println(catMassive[x].getAge());}
    }
int Summ(int x, int y){
int c= x + y;
    return c;
}


}