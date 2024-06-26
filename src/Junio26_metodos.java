public class Junio26_metodos {

    public static void funcionV() {
        System.out.println("Hola MUndo");
    }

    public static void funcionVParam(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static String funcionRet() {
        return "Hola Andres";
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static String funcionRetC() {
        if (12 < 10) {
            return "Mensaje con True";
        } else {
            return "Mensaje con False";
        }
    }
}
