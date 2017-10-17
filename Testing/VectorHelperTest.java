import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class VectorHelperTest {


    @Test
    public void sumTwoVectors() {
        Vector<Integer> vect1 = new Vector<Integer>(3);
        Vector<Integer> vect2 = new Vector<Integer>(3);
        Vector<Integer> vect3 = new Vector<Integer>(3);
        vect1.add(0, 10);
        vect1.add(1, 20);
        vect1.add(2, 30);
        vect2.add(0, 10);
        vect2.add(1, 20);
        vect2.add(2, 30);
        VectorHelper vectorHelper = new VectorHelper();
        try{
        vect3 = vectorHelper.sumTwoVectors(vect1,vect2);}catch(Exception e){}
        int a = 40;
        assertEquals(a,(int)vect3.get(1));
    }

    @Test
    public void reverseVector() {
        Vector<Integer> vect = new Vector<Integer>(3);
        vect.add(0, 10);
        vect.add(1, 20);
        vect.add(2, 30);
        VectorHelper vectorHelper = new VectorHelper();
        vectorHelper.reverseVector(vect);
        int a = 30;
        assertEquals(a,(int)vect.get(0));
    }

    @Test
    public void squareVector() {
        VectorHelper vectorHelper = new VectorHelper();
        Vector<Integer> vect = new Vector<Integer>(3);
        vect.add(0, 10);
        vect.add(1, 20);
        vect.add(2, 30);
        vectorHelper.squareVector(vect);
        int a = 900;
        assertEquals(a,(int)vect.get(2));

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