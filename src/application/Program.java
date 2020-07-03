package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	Student a = new Student();
    	
    	System.out.println("Enter Student data: ");
    	System.out.print("Name: ");
    	a.name = sc.nextLine();
    	System.out.print("Grade 1: ");
    	a.nota = sc.nextDouble();
    	System.out.print("Grade 2: ");
    	a.nota2 = sc.nextDouble();
    	System.out.print("Grade 3: ");
    	a.nota3 = sc.nextDouble();
    	
    	System.out.println();
    	System.out.println(a);
    	double b = a.grade();
    	if(b == 0.0) {
    		System.out.println("PASS");
    	}
    	else {
    		System.out.println("FAILED");
    		System.out.println("MISSING " + String.format("%.2f", b) + " POINTS" );
    	}
	}

}
