import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class VectorHelperTest {


    @Test
    public void sumTwoVectors() {
    }

    @Test
    public void reverseVector() {
    }

    @Test
    public void squareVector() {

    }

    @Test
    public void minMax() {
        VectorHelper vectorHelper = new VectorHelper();
        Vector v1= new Vector();
        v1.add(3);v1.add(2);
        int [] minmax=vectorHelper.minMax(v1);
        assertEquals(minmax[0],2);
        assertEquals(minmax[1],3);
    }

    @Test
    public void trierVect() {
        VectorHelper vectorHelper = new VectorHelper();
        Vector v13= new Vector(100);
        for(int i=0;i<=98;i++){
            v13.add(i,-i);
        }
        System.out.println();
        System.out.println();
        for(int i=0;i<=98;i++){
            System.out.print(v13.get(i)+"  ");
        }
        System.out.println();
        Vector<Integer> v23 = new Vector<Integer> ();
        v23=vectorHelper.trierVect(v13);
        System.out.println();
        for(int i=0;i<=98;i++){
            System.out.print(v23.get(i)+"  ");
            Assert.assertEquals(v23.get(i),new Integer(-98+i));
        }
    }

}