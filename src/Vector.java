public class Vector {
    public int[] minMax(int [] vecteur){
        int min=0;
        int max=0;
        if (vecteur.length!=0) {
            min = vecteur[0];
            max = vecteur[0];
            for (int i =0;i<vecteur.length; i++){
                if (min > vecteur[i]){
                    min=vecteur[i];
                }
                if (max < vecteur[i]){
                    max=vecteur[i];
                }
            }
        }
        return new int[] {min, max};
    }
}
