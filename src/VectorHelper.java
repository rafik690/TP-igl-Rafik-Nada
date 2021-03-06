import java.util.Comparator;
import java.util.Vector;
/**
 * Created by Guennoun Nada & Drissi Rafik Abdelmalek on 12/10/2017.
 */

/**
 * <p>
 *     Cette classe repesente un ensemle de fonctions
 *     de manipulation des vecteurs pour generer les informations suivantes :
 *     <ul>
 *         <li> Trie des elements d'un vecteur.</li>
 *         <li> Min et Max d'un vecteur donne. </li>
 *         <li> La somme de deux vecteurs donnes dans le cas ou les tailles sont identiques.</li>
 *         <li> L'inverse des elements d'un vecteur donne.</li>
 *         <li> Application d'une formule sur les elements d'un vecteur donne. </li>
 *     </ul>
 *
 */
public class VectorHelper {
    /**
     *
     * @param vect1
     *              represente le premier vecteur de taille ( m ) d'entiers
     *
     * @param vect2
     *              represente le deuxieme vecteur de taille ( n ) d'entiers
     *
     * Retourne un vecteur de la somme
     * @return vecteur de taille (m) dont les elements sont la somme des deux vecteurs
     * @throws DifferentSizeException Si les deux vecteurs ont des tailles differentes
     */
    public Vector<Integer> sumTwoVectors (Vector<Integer> vect1, Vector<Integer> vect2 ) throws DifferentSizeException {
        Vector<Integer> vectSum = new Vector(1,1);
        if (vect1.size() == vect2.size()) {

            for (int i = 0; i < vect1.size(); i++) {

                vectSum.add(vect1.get(i) + vect2.get(i));

            }
        }
        else throw new DifferentSizeException();

        return vectSum;
    }

    /**
     * Inverse les elements d'un vecteur
     *
     * @param vect
     *              le vecteur d'entiers
     */

    public void reverseVector( Vector<Integer> vect)
    {
        int tmp = 0;
        int i=0; int j = vect.size() - 1 ;

        while( i<(vect.size()/2) &&  j>=0)
        {
            tmp = vect.get(i);
            vect.setElementAt(vect.get(j),i);
            vect.setElementAt(tmp,j);

            i++; j--;
        }
    }

    /**
     * @param vect
     *              vecteur d'entiers
     *              Remplace chaque element du vecteur par son carre
     */
    public void squareVector( Vector<Integer> vect)
    {
        for ( int i=0; i< vect.size(); i++)
        {
            vect.setElementAt(vect.get(i)*vect.get(i), i);

        }
    }

    /**
     *
     * @param vecteur
     *                  le vecteur d'entiers en entrée
     * @return un tableau contenant deux entiers : min puis max.
     */
    public int[] minMax(Vector<Integer> vecteur){
        int min=0;
        int max=0;
        System.out.println(vecteur.size());
        if (vecteur.size()!=0) {
            min = vecteur.get(0);
            max = vecteur.get(0);
            for (int i =0;i<vecteur.size(); i++){
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

    /**
     *
     * @param vecteuri
     *                  le vecteur d'entiers en entrée
     * @return Un autre vecteur trié.
     */
    public Vector<Integer> trierVect(Vector<Integer> vecteuri){
        Vector<Integer> vecteur = (Vector<Integer>) vecteuri.clone();
        int n = vecteur.size();
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (vecteur.get(i) > vecteur.get(k)) {
                    permutNombres(i, k, vecteur);
                }
            }
        }
        return vecteur;
    }

    private void permutNombres(int i, int j, Vector<Integer> vecteur) {

        int temp;
        temp = vecteur.get(i);
        vecteur.set(i,vecteur.get(j));
        vecteur.set(j,temp);
    }
}
