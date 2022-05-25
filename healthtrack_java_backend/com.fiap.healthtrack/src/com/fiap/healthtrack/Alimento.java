package com.fiap.healthtrack;

public class Alimento {
	private int id_alimento;
	private String nm_alimento;
	private String tipo_alimento;
	private float calorias;
	private float carboidratos;
	private float proteinas;
	private float gorduras;
	private float porcao;
	
	public Alimento(int id_alimento, String nm_alimento, String tipo_alimento, float calorias, float carboidratos,float proteinas, float gorduras, float porcao) {
		super();
		this.id_alimento = id_alimento;
		this.nm_alimento = nm_alimento;
		this.tipo_alimento = tipo_alimento;
		this.calorias = calorias;
		this.carboidratos = carboidratos;
		this.proteinas = proteinas;
		this.gorduras = gorduras;
		this.porcao = porcao;
	}

	public int getId_alimento() {
		return id_alimento;
	}
	
	public void setId_alimento(int id_alimento) {
		this.id_alimento = id_alimento;
	}
	
	public String getNm_alimento() {
		return nm_alimento;
	}
	
	public void setNm_alimento(String nm_alimento) {
		this.nm_alimento = nm_alimento;
	}
	
	public String getTipo_alimento() {
		return tipo_alimento;
	}
	
	public void setTipo_alimento(String tipo_alimento) {
		this.tipo_alimento = tipo_alimento;
	}
	
	public float getCalorias() {
		return calorias;
	}
	
	public void setCalorias(float calorias) {
		this.calorias = calorias;
	}
	
	public float getCarboidratos() {
		return carboidratos;
	}
	
	public void setCarboidratos(float carboidratos) {
		this.carboidratos = carboidratos;
	}
	
	public float getProteinas() {
		return proteinas;
	}
	
	public void setProteinas(float proteinas) {
		this.proteinas = proteinas;
	}
	
	public float getGorduras() {
		return gorduras;
	}
	
	public void setGorduras(float gorduras) {
		this.gorduras = gorduras;
	}
	
	public float getPorcao() {
		return porcao;
	}
	
	public void setPorcao(float porcao) {
		this.porcao = porcao;
	}
	
}
