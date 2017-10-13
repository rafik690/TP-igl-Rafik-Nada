import java.util.Vector;

public class Main {

    public static void main(String[] args) {

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
    }
}
