import java.util.Scanner;

public class Celebridad
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre de una celebridad:");
        String palabra = sc.next();
        String url = "https://twitter.com/search?q=" + palabra;
        System.out.println(url);
    }
}
