package formas;

public class Quadrado {

	public float lado;
	
	public float area(float lado) {
		return lado * lado; 
	}
	public float perimetro(float lado) {
		return lado * 4; 
	}
	public double diagonal(float lado) {
		return lado * Math.sqrt(2); 
	}
	
	
	public Quadrado(float lado) {
		super();
		this.lado = lado;
	}
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	
	
}
