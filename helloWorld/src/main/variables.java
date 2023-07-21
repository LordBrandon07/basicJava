package main;

public class variables {

	public static void main(String[] args) {
		
		int numero = 8;
		System.out.println(numero);
		numero = 10;                   //se puede modificar el valor n veces
		System.out.println(numero);
		
		float flotante = 9.8f; // tiene que terminar con f
		
		char letra = 'a'; // comillas simples
		char number = 97; //
		System.out.println(letra); // char es caracter de tipo especial
		System.out.println(number);
		
		boolean verdad = true;
		
		int var1 =1, var2=2, var3=3;
		
		System.out.print(var1+"\n"); // con \n salto de linea
		System.out.println(var2); //print sin nada mas no da salto de lian pero println es salto de linea
		System.out.println(var3);
		
		final float pi =3.1416f; // con final es una constante 
		System.out.println(pi);
		
		var1++; // incrementar en 1
		System.out.println(var1);
		var2 += 5;
		System.out.println(var2);
	}

}
