package com.fiap.healthtrack;

import java.time.LocalDateTime;

public class Cardiaca {
	private int id_cardiaco;
	private LocalDateTime dt_registro_cardiaco;
	private float nr_bpm;
	private String ds_bpm;
	private float nr_pressao_arterial;
	private String ds_pressao_arterial;
	private int t_cliente_id_cliente;
	
	public int getId_cardiaco() {
		return id_cardiaco;
	}
	
	public void setId_cardiaco(int id_cardiaco) {
		this.id_cardiaco = id_cardiaco;
	}
	
	public LocalDateTime getDt_registro_cardiaco() {
		return dt_registro_cardiaco;
	}
	
	public void setDt_registro_cardiaco(LocalDateTime dt_registro_cardiaco) {
		this.dt_registro_cardiaco = dt_registro_cardiaco;
	}
	
	public float getNr_bpm() {
		return nr_bpm;
	}
	
	public void setNr_bpm(float nr_bpm) {
		this.nr_bpm = nr_bpm;
	}
	
	public String getDs_bpm() {
		return ds_bpm;
	}
	
	public void setDs_bpm(String ds_bpm) {
		this.ds_bpm = ds_bpm;
	}
	
	public float getNr_pressao_arterial() {
		return nr_pressao_arterial;
	}
	
	public void setNr_pressao_arterial(float nr_pressao_arterial) {
		this.nr_pressao_arterial = nr_pressao_arterial;
	}
	
	public String getDs_pressao_arterial() {
		return ds_pressao_arterial;
	}
	
	public void setDs_pressao_arterial(String ds_pressao_arterial) {
		this.ds_pressao_arterial = ds_pressao_arterial;
	}
	
	public int getT_cliente_id_cliente() {
		return t_cliente_id_cliente;
	}
	
	public void setT_cliente_id_cliente(int t_cliente_id_cliente) {
		this.t_cliente_id_cliente = t_cliente_id_cliente;
	}
	
}
