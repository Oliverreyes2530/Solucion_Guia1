package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CAST -> Convertir de un tipo de dato a otro
        int rpta1 = (int) Math.pow(5, 3);
        // Raiz cuadrada -> base elevada a la inversa del exp.
        float rpta2 = (float) Math.pow(81, 1/2.0);
        
        System.out.println("Resultados");
        System.out.println("------------------");
        System.out.println("Número 1...: " + rpta1);
        System.out.println("Número 2...: " + rpta2);
	}

}
