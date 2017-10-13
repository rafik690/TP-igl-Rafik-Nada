import java.util.Vector;
/**
 * Created by NADA on 13/10/2017.
 */
public class VectorHelper {

    static Vector<Integer> SumTwoVectors (Vector<Integer> vect1, Vector<Integer> vect2 ) throws DifferentSizeException {
        Vector<Integer> vectSum = new Vector(1,1);
        if (vect1.capacity() == vect2.capacity()) {

            for (int i = 0; i < vect1.capacity(); i++) {

                vectSum.add(vect1.get(i) + vect2.get(i));

            }
        }
        else throw new DifferentSizeException();

        return vectSum;
    }
}
