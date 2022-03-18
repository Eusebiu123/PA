package optional;


import java.util.ArrayList;

public class Problem {
    private int n = 3;
    public int[][] matrice = new int[n][n];
    public ArrayList<Source> listas = new ArrayList<>();


    public void setMatrice() { /*dam valori pt elementele matricii */
        matrice[0][0] = 2;
        matrice[0][1] = 3;
        matrice[0][2] = 1;
        matrice[1][0] = 5;
        matrice[1][1] = 4;
        matrice[1][2] = 8;
        matrice[2][0] = 5;
        matrice[2][1] = 6;
        matrice[2][2] = 8;
    }

    public int getMatrix(int matrice) {
        return matrice;
    }

    public void setListas(ArrayList l) {
        this.listas = l;
    }

    public void Problem(ArrayList l) {
        this.listas = l;
    }

}
