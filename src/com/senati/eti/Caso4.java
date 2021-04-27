package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float num1 = 0, num2 = 0;
		System.out.println("Primer número...: ");
		num1 = sc.nextFloat();
		
		System.out.println("Segundo número...: ");
		num2 = sc.nextFloat();
		
		System.out.println("Números ingresados...: ");
		System.out.println("---------------------: ");
		System.out.println("Suma........: " + (num1 + num2));
		System.out.println("Resta.......: " + (num1 - num2));
		System.out.println("Producto....: " + (num1 * num2));
		System.out.println("Division....: " + (num1 / num2));
		System.out.println("Restoentero.: " + (num1 % num2));
		
		
	}

}
