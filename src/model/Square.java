package model;

public class Square {
	private Double side;

	public Square(Double side) {
		validateSide(side);
		this.side = side;
	}

	public Double getSide() {
		return side;
	}

	public void setSide(Double side) {
		validateSide(side);
		this.side = side;
	}
	
	public double area() {
		return side * side; 
	}
	
	private void validateSide(double side) {
		if(side <= 0)
			throw new IllegalArgumentException("É necessário um valor positivo");
		
	}
}
