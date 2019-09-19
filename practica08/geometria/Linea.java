package geometria;
/**
*  Clase para crear líneas rectas en el plano Cartesiano
*  Objetivo: ilustrar la relación de agregación entre objetos.
*  @author  Gutiérrez Sánchez Claudia Itzel
*  @see     Punto
*/
public class Linea  {
private Punto p1;
private Punto p2;
/**
   * Constructor de una línea a partir de dos puntos
   * @param inicio -- punto de origen
   * @param fin -- segundo punto
   */

/**
 * Constructor por omisión
 */
public Linea (){
  p1=new Punto (0,0);
  p2=new Punto (1,1);
}
/**
 * Constructor de copia
 * @param linea -- Línea que se toma para crear una nueva
 */
public Linea (Linea linea){
 this.p1=linea.p1;
 this.p2=linea.p2;
}
/**
   * Determina la ecuación de una recta que pasa por 2 puntos
   * @return String -- La ecuación de la recta
   */
public String ecuacion (){

    return "y= "+pendiente()+"x +"+this.ordenada();

}
/**
 * Devuelve la pendiente de una recta.
 * @return double - La pendiente de la recta.
 */
public double pendiente(){
  double x2x1=p2.getX()-p1.getX();
  double y2y1=p2.getY()-p1.getY();
  if(x2x1!=0){
    return y2y1/x2x1;
  }else{
    return Double.POSITIVE_INFINITY;
  }

}
/**
 * Devuelve la ordenada al origen
 * @return double - La ordenada al origen
 */
public double ordenada (){
  double m =this.pendiente();
  double ordenada = (p2.getY()-p1.getY())-(p2.getX()-p1.getX())*m;
  return ordenada;
}
/**
 * Determina si un punto pertenece a la recta
 * @param p -- El que vamos a checar si pertenece a la recta o no
 * @return true si pertenece a la recta
 **/
public boolean contiene(Punto p){
  if(p.getY()==(this.pendiente()*p.getX()+this.ordenada())){
    return true;
  }else{
    return false;
  }
}
/**
 * Determina si dos líneas son paralelas
 * @param l1 -- Línea con la que se comparará la línea original
 * @return true si ambas líneas son paralelas y false en otro caso
 */
public boolean esParalelaA (Linea l1){
  return this.pendiente()==l1.pendiente();
}
/**
 * Determina si dos líneas son perpendiculares
 * @param l1 -- Línea con la que se comparará la línea original
 * @return true si ambas líneas son paralelas y false en otro caso
 */
public boolean esPerpendicularA (Linea l1){
  return this.pendiente()*l1.pendiente()==-1;
}
    public Punto getP1(){
	return p1;
}
public Punto getP2(){
return p2;
}
/**
  * Determina el punto de intersección entre dos líneas
  * @param l1 - la segunda línea
  * @return Punto - punto de intesercción
  */
//public Punto intersección(Linea l1){

//}
}
