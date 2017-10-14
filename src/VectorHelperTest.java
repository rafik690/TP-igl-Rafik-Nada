import groovy.util.GroovyTestCase;
import org.testng.annotations.Test;

import java.util.Vector;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by NADA on 14/10/2017.
 */
public class VectorHelperTest extends GroovyTestCase {
    public void testSquareVector1() throws Exception {
        Vector<Integer> vect = new Vector<Integer>();
        vect.add(0, 10);
        vect.add(1 , 20);
        vect.add(2 , 30);
        squareVector(vect);
        int a = 100;



    }

    @org.junit.Test
    public void sumTwoVectors() throws Exception {



    }

    @org.junit.Test
    public void reverseVector() throws Exception {

    }

    @Test
    public void squareVector(Vector<Integer> vect) throws Exception {

    }

}