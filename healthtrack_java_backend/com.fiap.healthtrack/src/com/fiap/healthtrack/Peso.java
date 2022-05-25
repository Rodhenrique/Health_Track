package com.fiap.healthtrack;

import java.time.LocalDateTime;

public class Peso{
    private int id_peso;
    private LocalDateTime dt_pesagem;
    private int nr_peso;
    private int t_cliente_id_cliente;
    
	public int getId_peso() {
		return id_peso;
	}
	
	public void setId_peso(int id_peso) {
		this.id_peso = id_peso;
	}
	
	public LocalDateTime getDt_pesagem() {
		return dt_pesagem;
	}
	
	public void setDt_pesagem(LocalDateTime dt_pesagem) {
		this.dt_pesagem = dt_pesagem;
	}
	
	public int getNr_peso() {
		return nr_peso;
	}
	
	public void setNr_peso(int nr_peso) {
		this.nr_peso = nr_peso;
	}
	
	public int getT_cliente_id_cliente() {
		return t_cliente_id_cliente;
	}
	
	public void setT_cliente_id_cliente(int t_cliente_id_cliente) {
		this.t_cliente_id_cliente = t_cliente_id_cliente;
	}
}