package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del personal: ");
        String nombre = sc.nextLine();
        
        System.out.println("Resultados");
        System.out.println("----------");
        System.out.println("Número de caracteres..: " + nombre.length());
        
	}

}
