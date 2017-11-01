public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Juego juego1=new Juego(4);
        juego1.muestraVidasRestantes();
        juego1.vidas--;
        juego1.muestraVidasRestantes();
        Juego juego2=new Juego(5);
        juego1.muestraVidasRestantes();
        juego2.muestraVidasRestantes();
    }
}
