public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
            String[] Languages = new String[]{"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
            int n=(int) (Math.random() * 1_000_000);
            n = n * 3; //inmultim n cu 3
        n= n+Integer.parseInt("10101",2);// adaugam la n 10101 in baza 2
        n= n+Integer.parseInt("FF",16);// adaugam la n ff transf din baza 16
        n = n * 6;//inm n cu 6
        int nr=0;//
        while(n>0){
            nr=nr+n%10;
            n=n/10;
        }
        System.out.println(nr);
    }
}
