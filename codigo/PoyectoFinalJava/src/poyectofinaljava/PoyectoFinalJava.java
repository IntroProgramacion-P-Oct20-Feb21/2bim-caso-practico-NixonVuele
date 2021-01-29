/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poyectofinaljava;

/**
 *
 * @author Nixon
 */
import java.util.Scanner;

public class PoyectoFinalJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int salida;
        int contador = 0;
        int opcion;
        while (bandera) {
            System.out.printf("Ingrese 1 si desea crear una cuenta de Facebook"
                    + "\nIngrese 2 si desea crear una cuenta de Twitter\n"
                    + "Ingrese 3 si desea crear una cuenta de Whatsapp\n"
                    + "Ingrese 6 si desea crear una cuenta de Telegram\n"
                    + "Ingrese 5 si desea crear una cuenta de Signal\n"
                    + "Ingrese 6 si desea crear una cuenta de Instagram\n"
                    + "Ingrese 7 si desea crear una cuenta de Flickr\n> ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.printf(crearFacebook());
                    break;
                case 2:
                    crarTwitter();
                    break;
                case 3:
                    System.out.println(crearWhatsapp());
                    break;
                case 4:
                    crearTelegram();
                    break;
                case 5:
                    System.out.println(crearSignal());
                    break;
                case 6:
                    crearInstagram();
                    break;
                case 7:
                    System.out.println(crearFlickr());
                    break;
                default:
                    System.out.println("No es una opcion a seleccionar");
            }
            contador = contador + 1;
            System.out.print("Ingrese el numero 1 si desea salir del ciclo\n>");
            salida = entrada.nextInt();
            if (salida == 1) {
                bandera = false;
            }
        }
        System.out.printf("La campaña es una: %s\n", obtenerMensaje(contador));
    }

    public static String crearFacebook() {
        Scanner entrada = new Scanner(System.in);
        String resumen;
        String nombre;
        int edad;
        String pais;
        String ciudad;
        String correo;
        System.out.println("<< Cuenta de Facebook >>");
        System.out.print("Nombre del usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Edad del usuario:\n> ");
        edad = entrada.nextInt();
        System.out.print("Ciudad del usuario:\n> ");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.print("Pais del usuario:\n> ");
        pais = entrada.nextLine();
        System.out.print("Correo del usuario:\n> ");
        correo = entrada.nextLine();
        resumen = String.format("----Cuenta de Facebook creada----\nNombre del "
                + "usuario: %s\nEdad del usuario: %d\nCiudad del usuario: %s\n"
                + "Pais del usuario: %s\nCorreo del usuario: %s\n",
                nombre, edad, ciudad, pais, correo);
        return resumen;
    }

    public static void crarTwitter() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String nombresCompletos;
        int edad;
        String apellidos;
        String idioma;
        String pais;
        String ciudad;
        String correo;
        System.out.println("<< Cuenta de Twitter >>");
        System.out.print("Nombre del usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Nombres Completos del usuario:\n> ");
        nombresCompletos = entrada.nextLine();
        System.out.print("Apellidos Completos del usuario:\n> ");
        apellidos = entrada.nextLine();
        System.out.print("Edad del usuario:\n> ");
        edad = entrada.nextInt();
        System.out.print("Ciudad del usuario:\n> ");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.print("Pais del usuario:\n> ");
        pais = entrada.nextLine();
        System.out.print("Idioma del usuario:\n> ");
        idioma = entrada.nextLine();
        System.out.print("Correo del usuario:\n> ");
        correo = entrada.nextLine();
        System.out.printf("----Cuenta de Twitter creada----\nNombre del "
                + "usuario: %s\nNombres Completos del usuario: %s\nApellidos "
                + "Completos del usuario: %s\nEdad del usuario: %d\nCiudad del "
                + "usuario: %s\nPais del usuario: %s\nPais del usuario: %s"
                + "\nCorreo del usuario: %s\n", nombre, nombresCompletos,
                apellidos, edad, ciudad, pais, idioma, correo);
    }

    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String resumen;
        String nombre;
        int telefono;
        int edad;
        String pais;
        String ciudad;
        System.out.println("<< Cuenta de Whatsapp >>");
        System.out.print("Nombre del usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Telefono del usuario:\n> ");
        telefono = entrada.nextInt();
        System.out.print("Edad del usuario:\n> ");
        edad = entrada.nextInt();
        System.out.print("Ciudad del usuario:\n> ");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.print("Pais del usuario:\n> ");
        pais = entrada.nextLine();
        resumen = String.format("----Cuenta de Whatsapp creada----\nNombre del "
                + "usuario: %s\nTelefono del usuario: %d\nEdad del usuario:"
                + " %d\nCiudad del usuario: %s\nPais del usuario: %s\n",
                nombre, telefono, edad, ciudad, pais);
        return resumen;
    }

    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int telefono;
        String pais;
        String ciudad;
        String interes;
        System.out.println("<< Cuenta de Telegram >>");
        System.out.print("Nombre del usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Telefono del usuario:\n> ");
        telefono = entrada.nextInt();
        System.out.print("Ciudad del usuario:\n> ");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.print("Pais del usuario:\n> ");
        pais = entrada.nextLine();
        System.out.print("Area de interes del usuario:\n> ");
        interes = entrada.nextLine();
        System.out.printf("----Cuenta de Telegram creada----\nNombre del "
                + "usuario: %s\nTelefono del usuario: %d\nCiudad del usuario: "
                + "%s\nPais del usuario: %s\nArea de interes del usuario: %s\n",
                nombre, telefono, ciudad, pais, interes);
    }

    public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String resumen;
        String nombre;
        int telefono;
        String pais;
        String ciudad;
        String hobby;
        System.out.println("<< Cuenta de Signal >>");
        System.out.print("Nombre del usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Telefono del usuario:\n> ");
        telefono = entrada.nextInt();
        System.out.print("Ciudad del usuario:\n> ");
        entrada.nextLine();
        ciudad = entrada.nextLine();
        System.out.print("Pais del usuario:\n> ");
        pais = entrada.nextLine();
        System.out.print("Hobby principal del usuario:\n> ");
        hobby = entrada.nextLine();
        resumen = String.format("----Cuenta de Signal creada----\nNombre del "
                + "usuario: %s\nTelefono del usuario: %d\nCiudad del usuario: "
                + "%s\nPais del usuario: %s\nHobby principal del usuario: %s\n",
                nombre, telefono, ciudad, pais, hobby);
        return resumen;

    }

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String ciudad;
        String correo;
        System.out.println("<< Cuenta de Instagram >>");
        System.out.print("Nombre del usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Ciudad del usuario:\n> ");
        ciudad = entrada.nextLine();
        System.out.print("Edad del usuario:\n> ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Correo del usuario:\n> ");
        correo = entrada.nextLine();
        System.out.printf("----Cuenta de Instagram creada----\nNombre del "
                + "usuario: %s\nCiudad del usuario: %s\nEdad del usuario: %d\n"
                + "Correo del usuario: %s\n",
                nombre, ciudad, edad, correo);
    }

    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String resumen;
        String nombre;
        String correo;
        System.out.println("<< Cuenta de Flickr >>");
        System.out.print("Nombre del usuario:\n> ");
        nombre = entrada.nextLine();
        System.out.print("Correo del usuario:\n> ");
        correo = entrada.nextLine();
        resumen = String.format("----Cuenta de Flickr creada----\nNombre del "
                + "usuario: %s\nCorreo del usuario: %s\n",
                nombre, correo);
        return resumen;

    }

    public static String obtenerMensaje(int cuentasCreadas) {
        String mensaje = "";
        String mensajeFinal[] = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante", "Excelente campaña"};
        if (cuentasCreadas >= 1 && cuentasCreadas <= 5) {
            mensaje = mensajeFinal[0];
        } else {
            if (cuentasCreadas >= 6 && cuentasCreadas <= 15) {
                mensaje = mensajeFinal[1];
            } else {
                if (cuentasCreadas >= 16) {
                    mensaje = mensajeFinal[2];
                }
            }

        }
        return mensaje;
    }
}
