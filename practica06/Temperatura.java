public class Temperatura {
public static int CELCIUS = 2;
public static int FARENHEIT = 1;
double valor;
int escala;
public Temperatura (double valor, int escala){
  this.valor = valor;
  this.escala = escala;
}
public double convertirAFarenheit (double valorC){
  return valorC*18+32;
}
public double convertirACelcius (double valor){
  return (valor-32)/1.8;
}
public double obtenerTemperaturaEnCelcius (){
  if(escala==CELCIUS){
    return valor;
  }
  else{
    return convertirACelcius(valor);
  }
}
public double obtenerTemperaturaEnFarenheit (){
  if(escala==FARENHEIT){
    return valor;
  }
  else{
    return convertirAFarenheit(valor);
  }
}
public boolean esIgual (Temperatura temp){
  return escala==temp.escala && valor==temp.valor;
}
public boolean esMayor (Temperatura temp){
  return obtenerTemperaturaEnCelcius() > temp.obtenerTemperaturaEnCelcius();
  }
public boolean esMenor (Temperatura temp){
  return obtenerTemperaturaEnCelcius() < temp.obtenerTemperaturaEnCelcius();
}
}
