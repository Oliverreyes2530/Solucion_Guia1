package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("Ingrese cantidad......: ");
        int cantidad = sc.nextInt();
        System.out.println("Ingrese precio........: ");
        float precio = sc.nextFloat();
        
        float importe1 = cantidad * precio;
		float importe2 = importe1 / 3.24f;
		float importe3 = importe1 / 3.75f;
				
		System.out.println("Resultados");
		System.out.println("----------");
		System.out.println("Importe S/: " + df.format(importe1));
		System.out.println("Importe US: " + df.format(importe2));
		System.out.println("Importe € : " + df.format(importe3));
	}

}
