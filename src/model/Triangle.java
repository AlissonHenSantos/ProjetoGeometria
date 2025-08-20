package model;

public class Triangle {

	private Double side;
	

	public Triangle(Double side) {
		validateSide(side);
		this.side = side;
	}
	

	public Double getSide() {
		return side;
	}
	
	public int getRoudedSide() {
		return (int) Math.floor(side);
	}

	public void setSide(Double side) {
		validateSide(side);
		this.side = side;
	}
	
	
	public double area() {
		return Math.pow(side, 2) * Math.sqrt(3) / 4; 
	}
	
	private void validateSide(Double side) {
		if(side <=0)
			throw new IllegalArgumentException("Valor inválido para o atributo side");
	}
}
