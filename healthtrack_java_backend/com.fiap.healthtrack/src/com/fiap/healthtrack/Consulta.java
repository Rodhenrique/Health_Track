package com.fiap.healthtrack;

import java.time.LocalDateTime;

public class Consulta {

    private int id_consulta;
    private LocalDateTime dt_consulta;
    private String ds_consulta;
    private int t_parceiro_id_parceiro;
    private int t_cliente_id_cliente;
    
	public int getId_consulta() {
		return id_consulta;
	}
	
	public void setId_consulta(int id_consulta) {
		this.id_consulta = id_consulta;
	}
	
	public LocalDateTime getDt_consulta() {
		return dt_consulta;
	}
	
	public void setDt_consulta(LocalDateTime dt_consulta) {
		this.dt_consulta = dt_consulta;
	}
	
	public String getDs_consulta() {
		return ds_consulta;
	}
	
	public void setDs_consulta(String ds_consulta) {
		this.ds_consulta = ds_consulta;
	}
	
	public int getT_parceiro_id_parceiro() {
		return t_parceiro_id_parceiro;
	}
	
	public void setT_parceiro_id_parceiro(int t_parceiro_id_parceiro) {
		this.t_parceiro_id_parceiro = t_parceiro_id_parceiro;
	}
	
	public int getT_cliente_id_cliente() {
		return t_cliente_id_cliente;
	}
	
	public void setT_cliente_id_cliente(int t_cliente_id_cliente) {
		this.t_cliente_id_cliente = t_cliente_id_cliente;
	}
}