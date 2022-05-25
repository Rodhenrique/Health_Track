package com.fiap.healthtrack;

import java.time.LocalDateTime;

public class Conta {
    private int id_conta;
    private String username;
    private String senha;
    private LocalDateTime dt_criacao;
    private LocalDateTime dt_alteracao;
    private int t_cliente_id_cliente;
    private int t_parceiro_id_parceiro;
    
	public int getId_conta() {
		return id_conta;
	}
	
	public void setId_conta(int id_conta) {
		this.id_conta = id_conta;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public LocalDateTime getDt_criacao() {
		return dt_criacao;
	}
	
	public void setDt_criacao(LocalDateTime dt_criacao) {
		this.dt_criacao = dt_criacao;
	}
	
	public LocalDateTime getDt_alteracao() {
		return dt_alteracao;
	}
	
	public void setDt_alteracao(LocalDateTime dt_alteracao) {
		this.dt_alteracao = dt_alteracao;
	}
	
	public int getT_cliente_id_cliente() {
		return t_cliente_id_cliente;
	}
	
	public void setT_cliente_id_cliente(int t_cliente_id_cliente) {
		this.t_cliente_id_cliente = t_cliente_id_cliente;
	}
	
	public int getT_parceiro_id_parceiro() {
		return t_parceiro_id_parceiro;
	}
	
	public void setT_parceiro_id_parceiro(int t_parceiro_id_parceiro) {
		this.t_parceiro_id_parceiro = t_parceiro_id_parceiro;
	}
}