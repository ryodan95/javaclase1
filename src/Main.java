public class Main {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 15;
        int numeroActual = numeroInicio;
//        while (numeroActual <= numeroFin) {
//            System.out.println(numeroActual + "");
//            numeroActual++;
//        }
        /* RESPUESTA B, SOLO NUMEROS PARES */
//        while (numeroActual <= numeroFin) {
//            if (numeroActual % 2 == 0) {
//                System.out.println(numeroActual + "");
//            }
//            numeroActual++;
//        }
        // RESPUESTA C //
//        boolean verPar = true;
//        while (numeroActual <= numeroFin) {
//            if ((numeroActual % 2 == 0 && verPar) || (numeroActual % 2 != 0 && !verPar)) {
//                System.out.println(numeroActual + "");
//            }
//            numeroActual++;
//        }
        //RESPUESTA D //
        int a = 6;
        int b = 16;
        for (int c = b; c >= a; c--) {
            if (c % 2 == 0) {
                System.out.println(c + "");
            }
        }
    }
}



