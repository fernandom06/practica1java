public class Juego {
    public int vidas;

    public Juego(int vidasIniciales){
        vidas=vidasIniciales;
    }
    /*public void muestraVidasRestantes(){
        System.out.println("Te quedan "+vidas+" vidas");
    }*/
    public int muestraVidasRestantes(){
         System.out.println("Te quedan "+vidas+" vidas");
         return vidas;
    }



}

