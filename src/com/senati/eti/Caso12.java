package com.senati.eti;

public class Caso12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String frase = "Escuela de tecnologia e informatica";
        String pl1 = frase.substring(0, 7);
        String pl2 = frase.substring(11, 21);
        String pl3 = frase.substring(24, 35);
        
        System.out.println("Resultados");
        System.out.println("----------");
        System.out.println("Palabra 1...: " + pl1);
        System.out.println("Palabra 2...: " + pl2);
        System.out.println("Palabra 3...: " + pl3);
	}

}
