package com.fiap.healthtrack;

import java.util.Date;

public class RegAlimento {
    private int id_registro;
    private Date dt_registro;
    private int qnt_alimento;
    private int t_cliente_id_cliente;
    private int t_alimento_id_alimento;
    
    public RegAlimento()
    {
    	
    }
    
	public RegAlimento(int id_registro, Date dt_registro, int qnt_alimento, int t_cliente_id_cliente, int t_alimento_id_alimento) {
		super();
		this.id_registro = id_registro;
		this.dt_registro = dt_registro;
		this.qnt_alimento = qnt_alimento;
		this.t_cliente_id_cliente = t_cliente_id_cliente;
		this.t_alimento_id_alimento = t_alimento_id_alimento;
	}

	public int getId_registro() {
		return id_registro;
	}
	
	public void setId_registro(int id_registro) {
		this.id_registro = id_registro;
	}
	
	public Date getDt_registro() {
		return dt_registro;
	}

	public void setDt_registro(Date dt_registro) {
		this.dt_registro = dt_registro;
	}

	public int getQnt_alimento() {
		return qnt_alimento;
	}
	
	public void setQnt_alimento(int qnt_alimento) {
		this.qnt_alimento = qnt_alimento;
	}
	
	public int getT_cliente_id_cliente() {
		return t_cliente_id_cliente;
	}
	
	public void setT_cliente_id_cliente(int t_cliente_id_cliente) {
		this.t_cliente_id_cliente = t_cliente_id_cliente;
	}
	
	public int getT_alimento_id_alimento() {
		return t_alimento_id_alimento;
	}
	
	public void setT_alimento_id_alimento(int t_alimento_id_alimento) {
		this.t_alimento_id_alimento = t_alimento_id_alimento;
	}
}
