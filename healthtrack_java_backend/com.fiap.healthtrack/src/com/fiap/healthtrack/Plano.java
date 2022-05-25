package com.fiap.healthtrack;

import java.time.LocalDateTime;

public class Plano {
	private int id_plano;
	private String ds_plano;
	private float valor_plano;
	private LocalDateTime dt_assinatura;
	private LocalDateTime dt_encerramento;
	private LocalDateTime dt_cancelamento;
	
	public int getId_plano() {
		return id_plano;
	}
	
	public void setId_plano(int id_plano) {
		this.id_plano = id_plano;
	}
	
	public String getDs_plano() {
		return ds_plano;
	}
	
	public void setDs_plano(String ds_plano) {
		this.ds_plano = ds_plano;
	}
	
	public float getValor_plano() {
		return valor_plano;
	}
	
	public void setValor_plano(float valor_plano) {
		this.valor_plano = valor_plano;
	}
	
	public LocalDateTime getDt_assinatura() {
		return dt_assinatura;
	}
	
	public void setDt_assinatura(LocalDateTime dt_assinatura) {
		this.dt_assinatura = dt_assinatura;
	}
	
	public LocalDateTime getDt_encerramento() {
		return dt_encerramento;
	}
	
	public void setDt_encerramento(LocalDateTime dt_encerramento) {
		this.dt_encerramento = dt_encerramento;
	}
	
	public LocalDateTime getDt_cancelamento() {
		return dt_cancelamento;
	}
	
	public void setDt_cancelamento(LocalDateTime dt_cancelamento) {
		this.dt_cancelamento = dt_cancelamento;
	}
}
