package com.fiap.healthtrack;

import java.time.LocalTime;

public class AtividadeFisica {
	private int id_atividade_fisica;
    private char nm_atividade;
    private char ds_atividade;
    private char categoria_atividade;
    private float calorias;
    private int repeticoes;
    private LocalTime  tempo;
    private int t_r_atividades_id_registro_atividade;
    
    public int getId_atividade_fisica() {
		return id_atividade_fisica;
	}
    
	public void setId_atividade_fisica(int id_atividade_fisica) {
		this.id_atividade_fisica = id_atividade_fisica;
	}
	
	public char getNm_atividade() {
		return nm_atividade;
	}
	
	public void setNm_atividade(char nm_atividade) {
		this.nm_atividade = nm_atividade;
	}
	
	public char getDs_atividade() {
		return ds_atividade;
	}
	
	public void setDs_atividade(char ds_atividade) {
		this.ds_atividade = ds_atividade;
	}
	
	public char getCategoria_atividade() {
		return categoria_atividade;
	}
	
	public void setCategoria_atividade(char categoria_atividade) {
		this.categoria_atividade = categoria_atividade;
	}
	
	public float getCalorias() {
		return calorias;
	}
	
	public void setCalorias(float calorias) {
		this.calorias = calorias;
	}
	
	public int getRepeticoes() {
		return repeticoes;
	}
	
	public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}
	
	public LocalTime getTempo() {
		return tempo;
	}
	
	public void setTempo(LocalTime tempo) {
		this.tempo = tempo;
	}
	
	public int getT_r_atividades_id_registro_atividade() {
		return t_r_atividades_id_registro_atividade;
	}
	
	public void setT_r_atividades_id_registro_atividade(int t_r_atividades_id_registro_atividade) {
		this.t_r_atividades_id_registro_atividade = t_r_atividades_id_registro_atividade;
	}
}