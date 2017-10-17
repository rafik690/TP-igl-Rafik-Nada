import java.util.Vector;

//import static org.junit.Assert.assertEquals;

public class Main {

    public static void main(String[] args) {
    /*
        VectorHelper vi = new VectorHelper();
        Vector<Integer> v = new Vector<Integer>();
        for (int i=10;i>-10;i--){
            v.add(i*2);
        }
        Vector<Integer> v2 = vi.trierVect(v);
        for (int i=0;i<v2.capacity();i++){
            System.out.print("  "+v2.get(i)+"  ");
        }
        System.out.println();
        for (int i=0;i<v.capacity();i++){
            System.out.print("  "+v.get(i)+"  ");
        }
*/
        VectorHelper vectorHelper = new VectorHelper();
        Vector v13= new Vector(100);
        for(int i=0;i<=98;i++){
            v13.add(i,-i);
        }
        System.out.println();
        for(int i=0;i<=98;i++){
            System.out.print("   "+v13.get(i));
        }
        System.out.println();
        System.out.println("    numero 3");
        v13.add(10,50);
        for(int i=0;i<=98;i++){
            System.out.print("   "+v13.get(i));
        }
        System.out.println();
        Vector<Integer> v23 = new Vector<Integer> ();
        v23=vectorHelper.trierVect(v13);
        for(int i=0;i<=99;i++){
            System.out.print("   "+v23.get(i));
        }
    }
}
