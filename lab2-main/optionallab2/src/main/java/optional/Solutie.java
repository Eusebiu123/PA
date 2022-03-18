package optional;

public class Solutie {
    private int total;
     /*  parcurgem un algoritm  ce satisface constrangerile de capacitate si necesar
     * Pt fiecare sursa luam pe rand fiecare dintre cele 3 destinatii si daca capacitatea sursei este mai mare decat
     * nevoia destinatiei scadem din capacitate valoare demand si trecem la urmatoarea destinatie ,altfel scadem din
     * nevoia destinatiei capacitatea sursei si trecem la urmatoarea sursa.   */
    public void solutie(Source S1,Source S2,Source S3,Destination D1,Destination D2, Destination D3) {
        Problem pb = new Problem();
        pb.setMatrice();
        if (S1.getCapacity() > 0) {
            if (S1.getCapacity() >= D1.getDemand() && S1.getCapacity() > 0 && D1.getDemand() > 0) {
                S1.setCapacity(S1.getCapacity() - D1.getDemand());
                int x = pb.matrice[0][0];
                int y = D1.getDemand();
                int produs = x * y;
                total = total + produs;
                System.out.print("S1->D1 : " + D1.getDemand() + " units * cost " + x + " = ");
                System.out.println(produs);
                D1.setDemand(0);
            }
            if (S1.getCapacity() <= D1.getDemand() && S1.getCapacity() > 0 && D1.getDemand() > 0) {
                D1.setDemand(D1.getDemand() - S1.getCapacity());
                int x = pb.matrice[0][0];
                int y = S1.getCapacity();
                int produs = x * y;
                total = total + produs;
                System.out.print("S1->D1 : " + S1.getCapacity() + " units * cost " + x + " = ");
                System.out.println(produs);
                S1.setCapacity(0);
            }
            if (S1.getCapacity() >= D2.getDemand() && S1.getCapacity() > 0 && D2.getDemand() > 0) {
                S1.setCapacity(S1.getCapacity() - D2.getDemand());
                int x = pb.matrice[0][1];
                int y = D2.getDemand();
                int produs = x * y;
                total = total + produs;
                System.out.print("S1->D2 : " + D2.getDemand() + " units * cost " + x + " = ");
                System.out.println(produs);
                D2.setDemand(0);
            }
            if (S1.getCapacity() <= D2.getDemand() && S1.getCapacity() > 0 && D2.getDemand() > 0) {
                D2.setDemand(D2.getDemand() - S1.getCapacity());
                int x = pb.matrice[0][1];
                int y = S1.getCapacity();
                int produs = x * y;
                total = total + produs;
                System.out.print("S1->D2 : " + S1.getCapacity() + " units * cost " + x + " = ");
                System.out.println(produs);
                S1.setCapacity(0);
            }
            if (S1.getCapacity() >= D3.getDemand() && S1.getCapacity() > 0 && D3.getDemand() > 0) {
                S1.setCapacity(S1.getCapacity() - D3.getDemand());
                int x = pb.matrice[0][2];
                int y = D3.getDemand();
                int produs = x * y;
                total = total + produs;
                System.out.print("S1->D3 : " + D3.getDemand() + " units * cost " + x + " = ");
                System.out.println(produs);
                D1.setDemand(0);
            }
            if (S1.getCapacity() <= D3.getDemand() && S1.getCapacity() > 0 && D3.getDemand() > 0) {
                D3.setDemand(D3.getDemand() - S1.getCapacity());
                int x = pb.matrice[0][2];
                int y = S1.getCapacity();
                int produs = x * y;
                total = total + produs;
                System.out.print("S1->D3 : " + S1.getCapacity() + " units * cost " + x + " = ");
                System.out.println(produs);
                S1.setCapacity(0);
            }
        }
        ///////////S2222222222
        if (S2.getCapacity() > 0) {
            if (S2.getCapacity() >= D1.getDemand() && S2.getCapacity() > 0 && D1.getDemand() > 0) {
                S2.setCapacity(S2.getCapacity() - D1.getDemand());
                int x = pb.matrice[1][0];
                int y = D1.getDemand();
                int produs = x * y;
                total = total + produs;
                System.out.print("S2->D1 : " + D1.getDemand() + " units * cost " + x + " = ");
                System.out.println(produs);
                D1.setDemand(0);
            }
            if (S2.getCapacity() <= D1.getDemand() && S2.getCapacity() > 0 && D1.getDemand() > 0) {
                D1.setDemand(D1.getDemand() - S2.getCapacity());
                int x = pb.matrice[1][0];
                int y = S2.getCapacity();
                int produs = x * y;
                total = total + produs;
                System.out.print("S2->D1 : " + S2.getCapacity() + " units * cost " + x + " = ");
                System.out.println(produs);
                S2.setCapacity(0);
            }
            if (S2.getCapacity() >= D2.getDemand() && S2.getCapacity() > 0 && D2.getDemand() > 0) {
                S2.setCapacity(S2.getCapacity() - D2.getDemand());
                int x = pb.matrice[1][1];
                int y = D2.getDemand();
                int produs = x * y;
                total = total + produs;
                System.out.print("S2->D2 : " + D2.getDemand() + " units * cost " + x + " = ");
                System.out.println(produs);
                D2.setDemand(0);
            }
            if (S2.getCapacity() <= D2.getDemand() && S2.getCapacity() > 0 && D2.getDemand() > 0) {
                D2.setDemand(D2.getDemand() - S2.getCapacity());
                int x = pb.matrice[1][1];
                int y = S2.getCapacity();
                int produs = x * y;
                total = total + produs;
                System.out.print("S2->D2 : " + S2.getCapacity() + " units * cost " + x + " = ");
                System.out.println(produs);
                S2.setCapacity(0);
            }
            if (S2.getCapacity() >= D3.getDemand() && S1.getCapacity() > 0 && D3.getDemand() > 0) {
                S2.setCapacity(S2.getCapacity() - D3.getDemand());
                int x = pb.matrice[1][2];
                int y = D3.getDemand();
                int produs = x * y;
                total = total + produs;
                System.out.print("S2->D3 : " + D3.getDemand() + " units * cost " + x + " = ");
                System.out.println(produs);
                D1.setDemand(0);
            }
            if (S2.getCapacity() <= D3.getDemand() && S2.getCapacity() > 0 && D3.getDemand() > 0) {
                D3.setDemand(D3.getDemand() - S2.getCapacity());
                int x = pb.matrice[1][2];
                int y = S2.getCapacity();
                int produs = x * y;
                total = total + produs;
                System.out.print("S2->D3 : " + S1.getCapacity() + " units * cost " + x + " = ");
                System.out.println(produs);
                S2.setCapacity(0);
            }
        }
        //////////////s333333333
        if (S3.getCapacity() > 0) {
            if (S3.getCapacity() >= D1.getDemand() && S3.getCapacity() > 0 && D1.getDemand() > 0) {
                S3.setCapacity(S3.getCapacity() - D1.getDemand());
                int x = pb.matrice[2][0];
                int y = D1.getDemand();
                int produs = x * y;
                total = total + produs;
                System.out.print("S3->D1 : " + D1.getDemand() + " units * cost " + x + " = ");
                System.out.println(produs);
                D1.setDemand(0);
            }
            if (S3.getCapacity() <= D1.getDemand() && S3.getCapacity() > 0 && D1.getDemand() > 0) {
                D1.setDemand(D1.getDemand() - S3.getCapacity());
                int x = pb.matrice[2][0];
                int y = S3.getCapacity();
                int produs = x * y;
                total = total + produs;
                System.out.print("S3->D1 : " + S2.getCapacity() + " units * cost " + x + " = ");
                System.out.println(produs);
                S3.setCapacity(0);
            }
            if (S3.getCapacity() >= D2.getDemand() && S3.getCapacity() > 0 && D2.getDemand() > 0) {
                S3.setCapacity(S3.getCapacity() - D2.getDemand());
                int x = pb.matrice[2][1];
                int y = D2.getDemand();
                int produs = x * y;
                total = total + produs;
                System.out.print("S3->D2 : " + D2.getDemand() + " units * cost " + x + " = ");
                System.out.println(produs);
                D2.setDemand(0);
            }
            if (S3.getCapacity() <= D2.getDemand() && S3.getCapacity() > 0 && D2.getDemand() > 0) {
                D2.setDemand(D2.getDemand() - S3.getCapacity());
                int x = pb.matrice[2][1];
                int y = S3.getCapacity();
                int produs = x * y;
                total = total + produs;
                System.out.print("S3->D2 : " + S3.getCapacity() + " units * cost " + x + " = ");
                System.out.println(produs);
                S3.setCapacity(0);
            }
            if (S3.getCapacity() >= D3.getDemand() && S3.getCapacity() > 0 && D3.getDemand() > 0) {
                S3.setCapacity(S3.getCapacity() - D3.getDemand());
                int x = pb.matrice[2][2];
                int y = D3.getDemand();
                int produs = x * y;
                total = total + produs;
                System.out.print("S3->D3 : " + D3.getDemand() + " units * cost " + x + " = ");
                System.out.println(produs);
                D1.setDemand(0);
            }
            if (S3.getCapacity() <= D3.getDemand() && S3.getCapacity() > 0 && D3.getDemand() > 0) {
                D3.setDemand(D3.getDemand() - S3.getCapacity());
                int x = pb.matrice[2][2];
                int y = S3.getCapacity();
                int produs = x * y;
                total = total + produs;
                System.out.print("S3->D3 : " + S1.getCapacity() + " units * cost " + x + " = ");
                System.out.println(produs);
                S3.setCapacity(0);
            }
            System.out.print("Total cost: " + total);
        }
    }

}
