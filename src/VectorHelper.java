import java.util.Vector;
/**
 * Created by NADA on 13/10/2017.
 */

/**
 * <p>
 *     Cette classe repesente un ensemle des fonctions
 *     de manipulation des vecteurs pour generer les informations suivantes :
 *     <ul>
 *         <li> Trie des elements d'un vecteur.</li>
 *         <li> Min et Max d'un vecteur donne. </li>
 *         <li> La somme de deux vecteurs donnes dans le cas ou les tailles sont identiques.</li>
 *         <li> L'inverse des elements d'un vecteur donne.</li>
 *         <li> Application d'une formule sur les elements d'un vecteur donne. </li>
 *     </ul>
 * </p>
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
    static Vector<Integer> SumTwoVectors (Vector<Integer> vect1, Vector<Integer> vect2 ) throws DifferentSizeException {
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

    static void ReverseVector( Vector<Integer> vect)
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
     * Remplace chaque element du vecteur par son carre
     * @param vect
     *              vecteur d'entiers
     */
    static void SquareVector( Vector<Integer> vect)
    {
        for ( int i=0; i< vect.size(); i++)
        {
            vect.setElementAt(vect.get(i)*vect.get(i), i);

        }
    }

}
