package application.entites;

public class Square {
	private Integer side;

	public Square(Integer side) {
		this.side = side;
	}

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}
	
	
	public int area() {
		return side * side; 
	}
	
	public String print() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < side; i++) {
			for(int j = 0; j < side; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
