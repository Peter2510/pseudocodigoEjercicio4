Algoritmo Ejercicio4
	
	mayor = 0
	menor = 0
	
	Escribir " Ingrese una edad "
	leer edad
	
	contador = contador + 1
	
	Si contador = 1 Entonces
		Emayor = edad
		Emenor = edad
	SiNo
		Si edad > Emayor Entonces
			edad = Emayor
		SiNo
			edad = Emenor
		Fin Si
		Si contador > contador + 1 & contador < 21 Entonces
			Escribir " El numero mayor ingresado es " ,Emayor ," y el numero menor ingresado es " , Emenor
		SiNo
			Escribir " Ingrese una edad "
			leer edad
		Fin Si 
	Fin Si
	
FinAlgoritmo
