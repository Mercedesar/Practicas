import java.util.Scanner;

public class LlamadaWhatsapp {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingresa el número de teléfono (sin espacios):");
      String telefono = sc.next();
      String url = "https://api.whatsapp.com/send?phone=" + telefono;
      System.out.println(url);
   }
}
