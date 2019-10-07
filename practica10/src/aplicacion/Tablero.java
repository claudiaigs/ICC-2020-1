package aplicacion;

import processing.core.PApplet;

public class Tablero extends PApplet {

    public static void main(String[] args) {
        PApplet.main(Tablero.class.getName());
    }

    @Override
    public void settings() {
        size(800, 800);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
      int ancho=0;
      int altura=0;

       for(int i = 0; i<5 ; i++){
      int casilla=100;
      int anchoN=ancho;
      int anchoB=ancho;
      for (int j = 1; j<5 ;j++){

        fill(0xFFFFFFFF);
        rect(anchoN, altura, casilla, casilla);
        anchoN+=100;
        fill(0xFF000000);
        rect(anchoN, altura, casilla, casilla);
        anchoN+=100;
      }
      altura+=100;
       for (int k = 1; k<5 ;k++){


        fill(0xFF000000);
        rect(anchoB, altura, casilla, casilla);
        anchoB+=100;
        fill(0xFFFFFFFF);
        rect(anchoB, altura, casilla, casilla);
        anchoB+=100;
      }
      altura+=100;
    }
    }

}
