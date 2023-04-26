package analisiss;
import java.util.Scanner;

public class VistasCuenta {
    private String nombreUsuario;
    private String correoElectronico;
    private String contrasena;
    private float saldo;

    public VistasCuenta(String nombreUsuario, String correoElectronico, String contrasena, float saldo) {
        this.nombreUsuario = nombreUsuario;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.saldo = saldo;
    }

    public void mostrarMenu() {
        System.out.println("Bienvenido/a " + nombreUsuario + " a su cuenta en nuestro market place.");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Ver su información de cuenta");
        System.out.println("2. Agregar dinero a su saldo");
        System.out.println("3. Comprar un producto");
        System.out.println("4. Salir");
    }

    public void mostrarInfoCuenta() {
        System.out.println("Información de cuenta:");
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Correo electrónico: " + correoElectronico);
        System.out.println("Contraseña: " + contrasena);
        System.out.println("Saldo: " + saldo);
    }

    public void agregarDinero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad a agregar: ");
        float cantidad = sc.nextFloat();
        saldo += cantidad;
        System.out.println("Se ha agregado " + cantidad + " a su saldo. Su saldo actual es: " + saldo);
    }

    public void comprarProducto(float precio) {
        if (saldo < precio) {
            System.out.println("Lo siento, no tiene suficiente saldo para comprar este producto.");
        } else {
            saldo -= precio;
            System.out.println("Se ha realizado la compra. Su saldo actual es: " + saldo);
        }
    }
}
