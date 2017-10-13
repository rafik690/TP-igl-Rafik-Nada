import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        VectorHelper vi = new VectorHelper();
        Vector<Integer> v = new Vector<Integer>();
        for (int i=-10;i<10;i++){
            v.add(i*2);
        }
        int [] minmax= vi.minMax(v);
        System.out.println("  "+minmax[0]+"  "+minmax[1]);
    }
}
