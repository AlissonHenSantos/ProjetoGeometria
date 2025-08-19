package application.entites;

public class Circle{
	private final double PI = Math.PI; 
	private Integer radius;
	
	
	public double area() {
		return PI * Math.pow(radius, 2) ; 
	}
	
	public String print() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < radius; i++) {
			for(int j = 0; j < radius; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
