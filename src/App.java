public class App {
    public static void main(String[] args) throws Exception {
String tekija = "Nenna";

        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.print("Ohjelman tekijä: ");
        System.out.println(tekija);
        
double luku1 = 5;
double luku2 = 2;

System.out.println("Luku1-muuttujan arvo on " + luku1);
System.out.println("Luku2-muuttujan arvo on " + luku2);

double tulo = luku1 * luku2;

System.out.println(luku1 + " * " + luku2 + " = " + tulo);
double erotus = luku1 - luku2;
double summa = luku1 + luku2;
double jako = luku1 / luku2;

System.out.println(luku1 + " - " + luku2 + " = " + erotus);
System.out.println(luku1 + " + " + luku2 + " = " + summa);
System.out.println(luku1 + " / " + luku2 + " = " + jako);      
    }
}
