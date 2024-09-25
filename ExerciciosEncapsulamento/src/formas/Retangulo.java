package formas;

public class Retangulo {
	
	public float largura ; 
	public float base;
	
	
	public Retangulo() {
		super();
	}
	public Retangulo(float largura, float base) {
		super();
		this.largura = largura;
		this.base = base;
	}
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float area(float base, float largura) {
		return base* largura; 
	}
	public float perimetro(float base, float largura) {
		return (base*2)+(largura*2);
	}
	

}
