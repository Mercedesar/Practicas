import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class BuscaPais {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un país: ");
        String pais = sc.nextLine();
        String url = "https://www.google.com/maps/search/" + pais;
        System.out.println(url);
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI(url));
        }
    }

}
