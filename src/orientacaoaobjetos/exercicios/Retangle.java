package orientacaoaobjetos.exercicios;

public class Retangle {
	private double width;
	private double height;

	public double area() {
		return width * height;
	}

	public double perimetro() {
		return (height + width) * 2;
	}

	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
