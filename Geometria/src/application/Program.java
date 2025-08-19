package application;

import java.util.Scanner;

import application.entites.Square;
import application.entites.Triangle;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual lado do quadrado?");
		int size = sc.nextInt();
		
		Square square = new Square(size);

		System.out.println(square.area());
		System.out.println(square.print());
		
		System.out.println("Qual lado do triangulo?");
		Triangle triangle = new Triangle(size);
		
		System.out.println(triangle.area());
		System.out.println(triangle.print());
		
		
		
		sc.close();
	}
	
}	
