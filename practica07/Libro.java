/**
* @author Gutiérrez Sánchez Claudia Itzel
* @version 10 de septiembre de 2019
**/
public class Libro {
 private String titulo,autor;
 private int añoPubli;

/**Constructor de objeto Libro sin parámetros, toma como valores iniciales 0, "", etc.
*/
  public Libro(){
    titulo = " ";
    añoPubli = 0;
    autor = "etc";
  }

/**Constructor de objeto Libro con parámetros
* @param año el año de publicación del Libro
* @param t el titulo del Libro
* @param a el nombre del autor del Libro
*/
  public Libro (int año , String t, String a){
    titulo = t;
    añoPubli = año;
    autor = a;
  }
/**Permite modificar el titulo del Libro
* @param nuevoTitulo el nuevo titulo del libro que estás modificando
*/
  public void setTitulo (String nuevoTitulo){
    titulo = nuevoTitulo;
  }
/**Permite modificar el nombre del autor del Libro
* @param nuevoAutor el nuevo nombre de autor por el que vas a cambiarlo
*/
  public void setAutor (String nuevoAutor){
    autor = nuevoAutor;
  }
/**Permite modificar el año de publicación del Libro
* @param nuevoAño el nuevo año de publicación
*/
  public void setAño (int nuevoAño){
    añoPubli = nuevoAño;
  }
/**Devuelve el titulo del libro
* @return el titulo del libro
*/
  public String getTitulo (){
    return titulo;
  }
/**Devuelve el nombre del autor del libro
* @return el autor del libro
*/
  public String getAutor(){
    return autor;
  }
/**Devuelve el año de Publicación del libro
* @return año de publicación del libro
*/
  public int getAño(){
    return añoPubli;
  }
}
