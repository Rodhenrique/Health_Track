package com.fiap.healthtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Interfaces.ICrud;

public class RotinaExercicio implements ICrud<RotinaExercicio>{
    // Lista de clientes para simular o armazenamento de dados
    private List<RotinaExercicio> rotinaExercicios = new ArrayList<RotinaExercicio>();

    // Atributos
    private int idRotinaExercicio;
    private String descricao;
    private List<Exercicio> exercicios = new ArrayList<Exercicio>();
    private Parceiro parceiro = new Parceiro();

    // GET SET
    public RotinaExercicio() {
    }

    public RotinaExercicio(int idRotinaExercicio,String descricao, List<Exercicio> exercicios,int idParceiro) {
        this.idRotinaExercicio = idRotinaExercicio;
        this.descricao = descricao;
        this.exercicios = exercicios;
        this.parceiro.setIdParceiro(idParceiro);
    }

    public void setIdRotinaExercicio(int idRotinaExercicio) {
		this.idRotinaExercicio = idRotinaExercicio;
	}

	public int getIdRotinaExercicio() {
		return idRotinaExercicio;
	}

    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

    public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}

	public List<Exercicio> getExercicios() {
		return exercicios;
	}

    public void setIdParceiro(int idParceiro) {
		this.parceiro.setIdParceiro(idParceiro);
	}

	public int getIdParceiro() {
		return parceiro.getIdParceiro();
	}

    //Metodos
    @Override
    public RotinaExercicio Consultar(String id) {
        return rotinaExercicios.stream().filter(x -> x.getIdRotinaExercicio() == Integer.parseInt(id)).collect(Collectors.toList()).get(0);
    }
    
    @Override
    public void Adicionar(RotinaExercicio item) {
        rotinaExercicios.add(item);        
    }

    @Override
    public void Atualizar(RotinaExercicio item) {
        rotinaExercicios.removeIf(x -> x.getIdRotinaExercicio() == item.getIdRotinaExercicio());
        rotinaExercicios.add(item);       
    }

    @Override
    public void Deletar(String id) {
        rotinaExercicios.removeIf(x -> x.getIdRotinaExercicio() == Integer.parseInt(id));                
    }
}
