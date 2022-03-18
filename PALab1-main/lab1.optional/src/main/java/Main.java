import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matrix m=new Matrix();
        int raspuns;
        Scanner in = new Scanner(System.in);
        System.out.print("Da-mi o valoare pt n:");
        int n = in.nextInt();
        int[][] matrice=new int[n][n];
        int vizitat[];
        vizitat =new int[n];
        m.Construire(n,matrice);
        m.Afisare(n,matrice);
        raspuns=m.Verificareconex(matrice,n,vizitat);
        if(raspuns==1) {
            System.out.println("Arborele este conex");
            System.out.println("Matricea asociata arborelui partial: ");
            for(int i=0;i<n;i++)
                vizitat[i]=0;
           m.Arborepartial(vizitat,matrice,n);
        }
        else System.out.println("Arborele nu este conex");
        long startTime = System.nanoTime();
        long estimatedTime = System.nanoTime() - startTime;
        System.out.print("Timpul de rulare in nanosecunde:"+estimatedTime);
    }
}
