import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado=0;
		
		Scanner teclado= new Scanner(System.in);
		
		 System.out.println("*****************************");
			System.out.println("Ingresar su opncion:");
			System.out.println("--------------------");
			System.out.println("1 pasa sumar");
			System.out.println("2 para restar");
			System.out.println("3 para multiplicar");
			System.out.println("4 2para dividir");
			System.out.println("");
			System.out.println("*****************************");	
			
		opcion = teclado.nextInt();
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
	
			switch(opcion){
			case 1:
				resultado=a+b;
				break;
				
			case 2:
				resultado=a-b;
				break;
				
			case 3:
				resultado=a*b;
				break;
				
			case 4:
				resultado=a/b;
				break;
			
		}
			System.out.println("El resultado es " + resultado.toString());

	}

}
