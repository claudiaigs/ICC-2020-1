package geometria;
/**
*Representa un polígono de tres lados. Está definido por
*tres puntos en el plano cartesiano
*@author Gutiérrez Sánchez Claudia Itzel
*@version 17 de septiembre de 2019
*/
public class Triangulo{
  private Punto a;
  private Punto b;
  private Punto c;
  /**
  *Triángulo con todos sus lados de la misma longitud.
  */
  public static final int EQUILATERO=0;
  /**
  *Triángulo con todos sus lados de longitud distinta.
  */
  public static final int ESCALENO=2;
/**
*Triángulo con exactamente dos lados de la misma longitud.
*/
  public static final int ISOSCELES=1;
/**
*Crea un triángulo equilátero de lado 1 con vértices en (0, 0), (1, 0) y (0.5, sin(π / 3)).
*/
  public Triangulo(){
    a=new Punto (0,0);
    b=new Punto (1,0);
    c=new Punto (0.5, Math.sin(Math.PI/ 3));

  }
  /**
  *Crea un triángulo con los tres puntos dados.
  *@param a - primer punto
  *@param b - segundo punto
  *@param c - tercer punto
  */
  public Triangulo (Punto a, Punto b, Punto c){
    this.a=new Punto (a.getX(), a.getY());
    this.b=new Punto (b.getX(), b.getY());
    this.c=new Punto (c.getX(), c.getY());
  }
  /**
  *Determina si los vértices de este triángulo están alineados.
  */
  public boolean tieneVerticesAlineados(){
    return a.estanAlineados(this.b,this.c)==true;
  }
  /**
  *Regresa el tipo de este triángulo según la longitud de sus lados; puede ser equilátero, isósceles o escaleno.
  */
  public int tipo(){
    if(a.distancia(this.b)==b.distancia(this.c)){
      if(c.distancia(this.a)==b.distancia(this.c)){
        return EQUILATERO;
      }else{
        return ISOSCELES;
      }
    }else{
      return ESCALENO;
    }
  }
public Punto getA(){
  return a;
}
public Punto getB(){
  return b;
}
public Punto getC(){
  return c;
}
}
