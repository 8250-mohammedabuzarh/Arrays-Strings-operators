package Arrays;
import java.util.ArrayList;

public class Arraylst {

    public static void main(String[] abbu)
    {
        ArrayList abc = new ArrayList();
        abc.add("Abbu");
        abc.add("Ajay");
        abc.add("Amit");
        abc.add("Ankit");
        System.out.println(abc);
        abc.remove(3);
        System.out.println(abc);
        abc.add(101);
        System.out.println(abc);

    }
}
