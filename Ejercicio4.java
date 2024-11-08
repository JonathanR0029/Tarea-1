package ejercicio.pkg4;

public class Ejercicio4 {

    public static void main(String[] args) {
 
        String[] nombres = {
            "ARNOLD ELIGIO AGUILAR CONTRERAS",
            "LISNY ALEXANDRA AGUILAR PÁREDES",
            "KEYSI YOELY AGUIRRE FUENTES",
            "ARNOL RAFAEL GUTIERREZ ALFARO",
            "BRIPNY LIZETH DUARTE GOMEZ",
            "CARLOS ROBERTO QUINTERO CHICAS",
            "CRISTIAN FERNANDO ZAMORA ENAMORADO",
            "DANLIS LEONEL BAIDE ENAMORADO",
            "DIMAS BELSASAR HERNANDEZ HERRERA",
            "EMANUEL ALEXANDER ORELLANA MARTINEZ"
        };

     
        System.out.println("Nombres de mis compañeros de clase:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i+1) + ". " + nombres[i]);
        }
    }
}