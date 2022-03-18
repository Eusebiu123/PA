import java.util.Scanner;
public class Matrix {
    public static void Construire(int n,int matrice[][]) {//construim matricea de adiacenta cu valori random (0,1)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = ((int) (Math.random() * 2));
            }
        }
    }
    public static void Afisare(int n,int matrice[][]){//afisam matricea de adiacenta
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }
    }
    public static int Verificareconex(int matrice[][],int n,int vizitat[])// verificam daca un arbore este conex adica verificam daca putem vizita toate nodurile din graf
    {
        int comp=0,prim,ultim,ns=0;
        int c[];
        c=new int[n+1];
        comp++;
        vizitat[ns]=1;
        System.out.print("Componenta conexa :"+comp+" este formata din nodurile :"+ns+" ");
        prim=ultim=1;
        c[ultim]=ns;
        while(prim<=ultim){
            for(int i=0;i<n;i++)
                if(matrice[c[prim]][i]==1)
                    if(vizitat[i]==0)
                    {
                        ultim++;
                        c[ultim]=i;
                        System.out.print(i+" ");
                        vizitat[i]=1;
                    }
            prim++;
        }
        System.out.println();
        for(int i=0;i<n;i++)//aici daca gasim un nod care nu e vizitat ....viz[i] va fi 0 deci arborele nu este conex
            if(vizitat[i]==0)
                return 0;
            return 1;
    }
    public static void Arborepartial(int vizitat[],int matrice[][],int n) {//aici construim o noua matrice de adiacenta..
        int[][] partial=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                partial[i][j]=0;

        for(int i=0;i<n;i++)
            partial[i][i]=1;

        for (int i = 0; i < n; i++)
            if (vizitat[i]==0) {// aplicam dfs si observam ca atunci cand aplicam dfs alg creeaza un arbore partial pe muchii
               Dfs(i,vizitat,matrice,n,partial);
                }
        Afisare(n,partial);
            }
    public static void Dfs( int k,int vizitat[],int matrice[][],int n,int partial[][]){
        vizitat[k] = 1;
        for (int i = 0; i < n; i++)
            if (matrice[i][k] == 1 && vizitat[i]==0) {
                Dfs(i, vizitat, matrice, n,partial);// cand vizitam un nou nod modificam matricea partial, care anterior era plina de 0
                partial[i][k]=1;
            }
    }
}

