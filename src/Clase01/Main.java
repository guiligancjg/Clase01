package Clase01;

public class Main {

    public static void main(String[] args) {

        // 1. a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”
    /*
        var numeroInicio = 5;
        var numeroFin = 14;

        while(numeroInicio <= numeroFin){
            System.out.println(numeroInicio);
            numeroInicio++;
        }//cierre while
    */

        // b. A lo anterior, solo muestre los números pares

    /*
        var numeroInicio = 5;
        var numeroFin = 14;

        while(numeroInicio <= numeroFin){
            if(numeroInicio % 2 == 0){
                System.out.println(numeroInicio);
            }//cierre if

            numeroInicio++;
        }//cierre while
     */

        // c. A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares
      /*
        Scanner consola = new Scanner(System.in);
        var numeroInicio = 5;
        var numeroFin = 14;

        System.out.print("Ingresé cero '0' para mostrar Pares o uno '1' para Impares: ");
        var variableExtra = consola.nextInt();

        while(numeroInicio <= numeroFin){
               if (numeroInicio % 2 == variableExtra) {
                System.out.println(numeroInicio);
                }//cierre if

               numeroInicio++;
            }//cierre while
     */

        // d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
     /*
        var numeroInicio = 5;

        for(int numeroFin=14; numeroFin >= numeroInicio; numeroFin--){
            if(numeroFin % 2 == 0){
                System.out.println(numeroFin);
            }//cierre if
        }//cierre for
     */



        //2. a. Lea atentamente el texto, primero que nada piense cuáles son las variables de entrada.
      /*
        Ingresos
        Vehículos
        Inmuebles
        Titular
      */
        //2. d. Finalmente, vea si puede resolver el problema utilizando código Java.
        var ingresos = 48900;
        var vehiculos = 3;
        var inmuebles = 4;
        boolean titulos = false;

        if(ingresos >= 489083 || vehiculos >= 3 || inmuebles >= 3 || titulos == true) {
            System.out.println("Pertenece al segmento de ingresos altos");
        }else {System.out.println("No pertenece al segmento de ingresos altos");}



    }//cierre manin
}
