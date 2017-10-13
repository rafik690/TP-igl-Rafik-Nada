import java.util.Vector;

public class VectorHelper {
    public int[] minMax(Vector<Integer> vecteur){
        int min=0;
        int max=0;
        if (vecteur.capacity()!=0) {
            min = vecteur.get(0);
            max = vecteur.get(0);
            for (int i =0;i<vecteur.capacity(); i++){
                if (min > vecteur.get(i)){
                    min=vecteur.get(i);
                }
                if (max < vecteur.get(i)){
                    max=vecteur.get(i);
                }
            }
        }
        return new int[] {min, max};
    }
}
