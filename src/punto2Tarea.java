public class punto2Tarea {
    /* las entradas serian
    1_ ingreso mensual mayor o igual a 489.000$
    2_tener 3 o mas vehiculos de antiguaedad menor a 5
    3_tener 3 o mas inmuebles
    4_poseer barco, avion o algun activo de lujo q demuestre q tenes mucha plata.
     */
    public static void main(String[] args) {
        double ingresos = 300000.0;
        int vehiculos = 3;
        int inmuebles = 3;
        boolean activoLujo = false;

        if ((ingresos >= 489000) && (vehiculos >= 3) && (inmuebles >= 3) && (!activoLujo)) {
            System.out.println("Categoría A");
        } else {
            System.out.println("Categoría B");
        }
    }
}

import java.util.Scanner;

//public class punto2Tarea {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ingrese su ingreso mensual: ");
//        double ingresos = scanner.nextDouble();
//
//        System.out.print("Ingrese el número de vehículos con antigüedad menor a 5 años: ");
//        int vehiculos = scanner.nextInt();
//
//        System.out.print("Ingrese el número de inmuebles que posee: ");
//        int inmuebles = scanner.nextInt();
//
//        System.out.print("¿Posee algún activo de lujo? (true/false): ");
//        boolean activoLujo = scanner.nextBoolean();
//
//        if ((ingresos >= 489000) && (vehiculos >= 3) && (inmuebles >= 3) && (!activoLujo)) {
//            System.out.println("Categoría A");
//        } else {
//            System.out.println("Categoría B");
//        }
//
//        scanner.close();
//    }