import java.util.Scanner;

public class Prueba {

    public void metodoPrueba(){
        Main instancia = new Main();
        instancia.numero = 1000;
        System.out.println(instancia.numero);
    }

    public void metodoPruebaS(){
        Main.numeroS = 99;
        System.out.println(Main.numeroS);
    }

    public static void ejercicio(){
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println(" Enter your favourite color :");
        String color = keyboard2.nextLine();
        //String colorI = color.intern();

        System.out.println(color.equals("color") ? "The color is correct" : "The color is incorrect");
    }
}
