package com.fiap.healthtrack;

public class Cliente {
   private int id_cliente;
   private String nm_cliente;
   private String cpf;
   private float altura;
   private char genero;
   private char status;
   private int t_conta_id_conta;
   private int t_plano_id_plano;
   
   public int getId_cliente() {
		return id_cliente;
   }
   
   public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
   }
   
   public String getNm_cliente() {
		return nm_cliente;
	}
   
	public void setNm_cliente(String nm_cliente) {
		this.nm_cliente = nm_cliente;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public char getGenero() {
		return genero;
	}
	
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public char getStatus() {
		return status;
	}
	
	public void setStatus(char status) {
		this.status = status;
	}
	
	public int getT_conta_id_conta() {
		return t_conta_id_conta;
	}
	
	public void setT_conta_id_conta(int t_conta_id_conta) {
		this.t_conta_id_conta = t_conta_id_conta;
	}
	
	public int getT_plano_id_plano() {
		return t_plano_id_plano;
	}
	
	public void setT_plano_id_plano(int t_plano_id_plano) {
		this.t_plano_id_plano = t_plano_id_plano;
	}
}
