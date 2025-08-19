package application.entites;

public class Triangle{
	private Integer side;
	
	

	public Triangle(Integer side) {
		this.side = side;
	}
	

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}
	
	
	public double area() {
		return Math.pow(side, 2) * Math.sqrt(3) / 4; 
	}
	
	public String print() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= side; i++) {
		}
		return sb.toString();
	}
}
