public class Junio22_switch {
    public static void switchE() {

        String opcion = "uno";

        switch (opcion) {
            case "uno":
                System.out.println("Seleccionaste la opcion 1");
                break;
            case "dos":
                System.out.println("Seleccionaste la opcion 2");
                break;
            case "tres":
                System.out.println("Seleccionaste la opcion 3");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
