package dtos;

public class Endereco {
	
	private String cep; 
	private String estado;
	private String municipio;
	private String bairro;
	private String rua;
	private String numeroResidencia;
	public Endereco(String cep, String estado, String municipio, String bairro, String rua, String numeroResidencia) {
		super();
		this.cep = cep;
		this.estado = estado;
		this.municipio = municipio;
		this.bairro = bairro;
		this.rua = rua;
		this.numeroResidencia = numeroResidencia;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumeroResidencia() {
		return numeroResidencia;
	}
	public void setNumeroResidencia(String numeroResidencia) {
		this.numeroResidencia = numeroResidencia;
	}
	@Override
	public String toString() {
		return "Endereco cep=" + cep + ", estado=" + estado + ", municipio=" + municipio + ", bairro=" + bairro
				+ ", rua=" + rua + ", numeroResidencia=" + numeroResidencia;
	}
	
	
	

}
