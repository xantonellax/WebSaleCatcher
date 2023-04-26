package analisiss;
import java.util.Scanner;

public class Inicio {
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;

    System.out.println("Bienvenido a WebsaleCatcher");
    System.out.println("Por favor selecciona una opción:");

    do {
      System.out.println("1. Iniciar sesión");
      System.out.println("2. Registrarse");
      System.out.println("3. Salir");

      opcion = sc.nextInt();

      switch (opcion) {
        case 1:
          iniciarSesion();
          break;
        case 2:
          registrarse();
          break;
        case 3:
          System.out.println("Gracias por visitarnos. ¡Hasta pronto!");
          break;
        default:
          System.out.println("Opción inválida. Por favor ingresa una opción válida.");
          break;
      }
    } while (opcion != 3);
  }

  public static void iniciarSesion() {
    Scanner sc = new Scanner(System.in);
    String usuarioCorrecto = "Ingrese su correo eletronico";
    String passwordCorrecto = "Ingrese su contraseña";
    String usuario, password;

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

  public static void registrarse() {
    Scanner sc = new Scanner(System.in);
    String nombre, correo, password;

    System.out.println("Por favor ingresa tus datos de registro.");

    System.out.print("Nombre completo: ");
    nombre = sc.nextLine();

    System.out.print("Correo electrónico: ");
    correo = sc.nextLine();

    System.out.print("Contraseña: ");
    password = sc.nextLine();

    System.out.println("¡Gracias por registrarte, " + nombre + "! Ya puedes iniciar sesión en la página web.");
  }
}