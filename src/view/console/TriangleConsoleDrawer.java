package view.console;

import model.Triangle;

public class TriangleConsoleDrawer {

	private Triangle triangle;
	
	public TriangleConsoleDrawer(Triangle triangle) {
		if(triangle == null)
			throw new IllegalArgumentException("Instância inválida de Triangle");
		
		this.triangle = triangle;
	}
	
	public void print() {
		for (int i = 1; i <= triangle.getRoudedSide(); i++) {
		    String spaces = " ".repeat(triangle.getRoudedSide()- i);
		    String stars = "*".repeat(2 * i - 1);
		    System.out.println(spaces + stars + "\n");
		}
	}
}
