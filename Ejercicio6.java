package ejercicio.pkg6;

public class Ejercicio6 {

    public static void main(String[] args) {
        String[] nombres = {"Daniel", "Monica", "Carlos", "Arnold", "Keysi"};
        int[] notas = {65, 89, 75, 45, 91};

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i]);
            System.out.println("Nota: " + notas[i]);

            if (notas[i] >= 70) {
                System.out.println("Estado: Aprobado");
            } else {
                System.out.println("Estado: Reprobado");
            }
            System.out.println();
        }
    }
}