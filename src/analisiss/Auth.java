package analisiss;
import java.util.Scanner;

public class Auth {
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);
    String usuarioCorrecto = "digite su correo electronico";
    String passwordCorrecto = "digite su contraseña";
    String usuario, password;

    System.out.println("Bienvenido a la página web");
    System.out.println("Por favor ingresa tus datos de autenticación.");

    do {
      System.out.print("Usuario: ");
      usuario = sc.nextLine();

      System.out.print("Contraseña: ");
      password = sc.nextLine();

      if (!usuario.equals(usuarioCorrecto) || !password.equals(passwordCorrecto)) {
        System.out.println("Usuario o contraseña incorrectos. Por favor inténtalo nuevamente.");
      }
    } while (!usuario.equals(usuarioCorrecto) || !password.equals(passwordCorrecto));

    System.out.println("Bienvenido, " + usuario + ". Has ingresado correctamente a la página web.");
  }
}
