import java.util.Scanner;

public class RFC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre , nacimiento , rfcn , rfcf , rfc;
		int espacio1 , espacio2 , espacio3 , espacio4 , diagonal1 , diagonal2;
		System.out.println ("Introduce tu nombre completo");
		nombre = scanner.nextLine();
		System.out.println ("Introduce tu fecha de nacimiento en formato dd/mm/aaaa");
		nacimiento = scanner.nextLine();
		nombre=nombre.trim();
    espacio2=nombre.lastIndexOf(' ');
		espacio1=nombre.indexOf(' ');
		espacio1+=1;
		espacio2+=1;
		espacio3 = espacio1 + 2;
		espacio4 = espacio2 + 1;
		rfc = nombre.substring(espacio1, espacio3);
		rfcn = nombre.substring(espacio2, espacio4);
		rfc = rfc + rfcn;
		System.out.println(rfc);
		rfc = rfc + (nombre.substring(0 , 1));
		rfcf = nacimiento.substring(8,10);
		rfcf = rfcf + (nacimiento.substring(3,5));
		rfcf = rfcf + (nacimiento.substring(0,2));
		rfc = rfc + rfcf;
		rfc = rfc.toUpperCase();
		System.out.println("El RFC de " + nombre + " es : " + rfc);



	}

}
