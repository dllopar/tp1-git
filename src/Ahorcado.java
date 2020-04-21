import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado=0;
		
		Scanner teclado= new Scanner(System.in);
		
		do{
			System.out.println("*****************************");
			System.out.println("Ingresar su opncion:");System.out.println("--------------------");
			System.out.println("1 para multiplicar");
			System.out.println("2 para restar");
			System.out.println("3 pasa sumar");
			System.out.println("4 2para dividir");
			System.out.println("");
			System.out.println("*****************************");
		
		
		opcion = teclado.nextInt();
			}while(opcion < 1 && opcion >4);
		System.out.println("Ingresar el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingresar el segundo numero numero");
		b = teclado.nextInt();
		if(opcion.equals(1)) {
			resultado = a * b;	
		}else if (opcion.equals(2)){
			resultado = a + b;
		}else if (opcion.equals(3)) {
			resultado = a + b;
		}else {
			resultado = a / b;
		}
			System.out.println("El resultado es " + resultado.toString());

	}

}
