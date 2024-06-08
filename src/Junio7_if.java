public class Junio7_if {
    public static void ifE() {

        // if - else
        int numero = 3;
        if (numero > 4) {
            System.out.println("La condicion es verdadera");
        } else {
            System.out.println("La condicion es false");
        }

        // sintaxis expresion ternaria (?)
        // condicion ? valor si True : valor si false
        String mensaje;
        mensaje = numero > 4 ? "La condicion es verdadera" : "La condicion es false";
        System.out.println(mensaje);

        // else - if
        int numero1 = 5;
        if (numero1 > 0) {
            System.out.println("el numero es positivo");
        } else if (numero < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es cero");
        }

        // caso especial
        System.out.println("************************");
        int numero2 = 1;
        if (numero2 > 0) {
            System.out.println("el numero es positivo");
        }
        if (numero2 < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es cero");
        }

    }
}
