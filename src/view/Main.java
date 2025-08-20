package view;

import java.util.Scanner;

import model.Square;
import model.Triangle;
import view.console.SquareConsoleDrawer;
import view.console.TriangleConsoleDrawer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual lado do quadrado?");
		double size = sc.nextDouble();
		
		Square square = new Square(size);

		System.out.println(square.area());
		
		SquareConsoleDrawer scd = new SquareConsoleDrawer(square);
		scd.print();
		
		square.setSide(10.0);
		
		System.out.println(square.area());
		scd.print();
		
		System.out.println("Qual lado do triangulo?");
		
		size = sc.nextDouble();
		
		Triangle triangle = new Triangle(size);
		
		triangle.area();
		
		TriangleConsoleDrawer tcd = new TriangleConsoleDrawer(triangle);
		
		tcd.print();
		
		sc.close();
	}
}
