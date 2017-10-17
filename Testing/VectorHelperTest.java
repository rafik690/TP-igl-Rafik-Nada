import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

/**
 * Created by NADA on 15/10/2017.
 */
public class VectorHelperTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void sumTwoVectors() throws Exception {
        Vector<Integer> vect1 = new Vector<Integer>(3);
        Vector<Integer> vect2 = new Vector<Integer>(3);
        Vector<Integer> vect3 = new Vector<Integer>(3);
        vect1.add(0, 10);
        vect1.add(1, 20);
        vect1.add(2, 30);
        vect2.add
                (0, 10);
        vect2.add(1, 20);
        vect2.add(2, 30);
        VectorHelper vectorHelper = new VectorHelper();
        vect3 = vectorHelper.SumTwoVectors(vect1,vect2);
        int a = 40;
        assertEquals(a,(int)vect3.get(1));

    }

    @Test
    public void reverseVector() throws Exception {
        Vector<Integer> vect = new Vector<Integer>(3);
        vect.add(0, 10);
        vect.add(1, 20);
        vect.add(2, 30);
        VectorHelper vectorHelper = new VectorHelper();
        vectorHelper.ReverseVector(vect);
        int a = 30;
        assertEquals(a,(int)vect.get(0));

    }

    @Test
    public void squareVector() throws Exception {
            VectorHelper vectorHelper = new VectorHelper();
                Vector<Integer> vect = new Vector<Integer>(3);
                vect.add(0, 10);
                vect.add(1, 20);
                vect.add(2, 30);
                vectorHelper.SquareVector(vect);
                  int a = 900;
                  assertEquals(a,(int)vect.get(2));

    }

}