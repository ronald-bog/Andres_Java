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
}
