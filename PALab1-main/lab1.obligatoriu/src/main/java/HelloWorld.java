public class HelloWorld {

    public static void Afisare()
    {
        String sir="Hello world!";
        System.out.println(sir);
    }
    public static int Operations() {
            int n = (int) (Math.random() * 1_000_000);
            n = n * 3; //inmultim n cu 3
            n = n + Integer.parseInt("10101", 2);// adaugam la n 10101 in baza 2
            n = n + Integer.parseInt("FF", 16);// adaugam la n ff transf din baza 16
            n = n * 6;//inm n cu 6
            int nr = 0;//un intreg =0
            while (n > 0) { //ca timp n ul are cifre calculam suma cifrelor lui n
                nr = nr + n % 10;
                n = n / 10;
            }
            int aux=0;
            aux=nr; //
            while(aux>9)// cat timp nr are mai mult de 2 cifre(>9) vom face suma cifrelor
            {
                nr=0;
                while(aux>0) // cat timp aux are cifre facem suma lor
                {
                    nr=nr+aux%10;
                    aux=aux/10;
                }
                aux=nr;// aici atribuim lui aux suma cifrelor ca sa verificam daca aux are mai mult de 2 cifre in while ul principal
            }
            System.out.println(aux);//afisam valoarea lui aux
            return aux;//o returnam ca sa ne folosim de ea in main
        }
        public static void Sirinteresant(int x){
            String[] Languages = new String[]{"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
            System.out.println("Willy-nilly, this semester I will learn " + Languages[x]);//propozitia + al 'ana' cuvant din sirul languages
        }
    }
