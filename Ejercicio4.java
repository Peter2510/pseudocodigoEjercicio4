import java.util.Scanner;


public class Ejercicio4{

public static void main(String [] args){

	// variables
	int edad;

	int mayor =0;
	int menor =0;

	//definir el scanner

	Scanner num = new Scanner(System.in);

	//Solicitar las edades


	for (int i=0; i<20 ;i++ ) {


	System.out.print("\nIngrese un numero: ");
	edad = num.nextInt();

	//salto de linea
	System.out.print("\n");

		if (i==0) {

			mayor = edad;
			menor = edad;
			System.out.println("el mayor es: "+ mayor+ " menor: "+menor);
			
		}

		else{

			if (edad > mayor) {

				mayor = edad;

				System.out.println("el mayor es: "+ mayor+ " menor: "+menor);


			}

			if (edad < menor) {

				menor = edad;
				System.out.println("el mayor es: "+ mayor+ " menor: "+menor);


		}

		if (edad == menor || edad == mayor) {

				
				System.out.println("el mayor es: "+ mayor+ " menor: "+menor);


		}


		
	}


  	}

  }
}
