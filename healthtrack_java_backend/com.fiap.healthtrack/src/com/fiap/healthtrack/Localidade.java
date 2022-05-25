package com.fiap.healthtrack;

public class Localidade {
    private int id_localidade;
    private String nm_estado;
    private String nm_cidade;
    private String nm_regiao;
    private int cep;
    private int nr_casa;
    private String complemento;
    private int t_cliente_id_cliente;
    
	public int getId_localidade() {
		return id_localidade;
	}
	
	public void setId_localidade(int id_localidade) {
		this.id_localidade = id_localidade;
	}
	
	public String getNm_estado() {
		return nm_estado;
	}
	
	public void setNm_estado(String nm_estado) {
		this.nm_estado = nm_estado;
	}
	
	public String getNm_cidade() {
		return nm_cidade;
	}
	
	public void setNm_cidade(String nm_cidade) {
		this.nm_cidade = nm_cidade;
	}
	
	public String getNm_regiao() {
		return nm_regiao;
	}
	
	public void setNm_regiao(String nm_regiao) {
		this.nm_regiao = nm_regiao;
	}
	
	public int getCep() {
		return cep;
	}
	
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public int getNr_casa() {
		return nr_casa;
	}
	
	public void setNr_casa(int nr_casa) {
		this.nr_casa = nr_casa;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public int getT_cliente_id_cliente() {
		return t_cliente_id_cliente;
	}
	
	public void setT_cliente_id_cliente(int t_cliente_id_cliente) {
		this.t_cliente_id_cliente = t_cliente_id_cliente;
	}
}
