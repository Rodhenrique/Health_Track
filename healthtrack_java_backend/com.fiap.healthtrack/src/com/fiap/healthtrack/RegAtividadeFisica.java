package com.fiap.healthtrack;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class RegAtividadeFisica {
    private int id_registro_atividade;
    private LocalDateTime dt_inicio;
    private LocalDateTime dt_encerramento;
    private LocalTime  tempo_total;
    private int repeticoes;
    private int t_cliente_id_cliente;
    
	public int getId_registro_atividade() {
		return id_registro_atividade;
	}
	
	public void setId_registro_atividade(int id_registro_atividade) {
		this.id_registro_atividade = id_registro_atividade;
	}
	
	public LocalDateTime getDt_inicio() {
		return dt_inicio;
	}
	
	public void setDt_inicio(LocalDateTime dt_inicio) {
		this.dt_inicio = dt_inicio;
	}
	
	public LocalDateTime getDt_encerramento() {
		return dt_encerramento;
	}
	
	public void setDt_encerramento(LocalDateTime dt_encerramento) {
		this.dt_encerramento = dt_encerramento;
	}
	
	public LocalTime getTempo_total() {
		return tempo_total;
	}
	
	public void setTempo_total(LocalTime tempo_total) {
		this.tempo_total = tempo_total;
	}
	
	public int getRepeticoes() {
		return repeticoes;
	}
	
	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}
	
	public int getT_cliente_id_cliente() {
		return t_cliente_id_cliente;
	}
	
	public void setT_cliente_id_cliente(int t_cliente_id_cliente) {
		this.t_cliente_id_cliente = t_cliente_id_cliente;
	}
}
