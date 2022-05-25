package com.fiap.healthtrack;

public class Parceiro {
    private int id_parceiro;
    private String nm_parceiro;
    private int especialidade;
    private int tipo_contrato;
    private int t_conta_id_conta;
    private int t_localidade_id_localidade;
    
	public int getId_parceiro() {
		return id_parceiro;
	}
	
	public void setId_parceiro(int id_parceiro) {
		this.id_parceiro = id_parceiro;
	}
	
	public String getNm_parceiro() {
		return nm_parceiro;
	}
	
	public void setNm_parceiro(String nm_parceiro) {
		this.nm_parceiro = nm_parceiro;
	}
	
	public int getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(int especialidade) {
		this.especialidade = especialidade;
	}
	
	public int getTipo_contrato() {
		return tipo_contrato;
	}
	
	public void setTipo_contrato(int tipo_contrato) {
		this.tipo_contrato = tipo_contrato;
	}
	
	public int getT_conta_id_conta() {
		return t_conta_id_conta;
	}
	
	public void setT_conta_id_conta(int t_conta_id_conta) {
		this.t_conta_id_conta = t_conta_id_conta;
	}
	
	public int getT_localidade_id_localidade() {
		return t_localidade_id_localidade;
	}
	
	public void setT_localidade_id_localidade(int t_localidade_id_localidade) {
		this.t_localidade_id_localidade = t_localidade_id_localidade;
	}
}
