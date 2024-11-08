package ejercicio.pkg5;

public class Ejercicio5 {

    public static void main(String[] args) {

        String[][] compañeros = {
            {"Keysi", "Fuentes", "Ingeniería en Sistemas", "Negocio propio (arreglos y manualidades)"},
            {"Carlos", "Portillo", "Ingeniería en Computación", "Tecnicom"},
            {"Arnold", "Aguilar", "Ingeniería Electrónica", "Técnico electricista (energía renovable)"},
            {"Cristian", "Zamora Enamorado", "Ingeniería en Producción Industrial", "N/A"},
            {"Jasson", "Ortega", "Ingeniería en Producción Industrial", "N/A"}
        };


        System.out.println("Datos personales de mis compañeros de clase:");
        for (int i = 0; i < compañeros.length; i++) {
            System.out.println("Compañero " + (i+1) + ":");
            System.out.println("Nombre: " + compañeros[i][0]);
            System.out.println("Apellido: " + compañeros[i][1]);
            System.out.println("Carrera: " + compañeros[i][2]);
            System.out.println("Lugar de Trabajo: " + compañeros[i][3]);
            System.out.println();
        }
    }
}