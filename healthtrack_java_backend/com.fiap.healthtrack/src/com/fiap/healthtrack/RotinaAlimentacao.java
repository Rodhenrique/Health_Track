package com.fiap.healthtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Interfaces.ICrud;

public class RotinaAlimentacao implements ICrud<RotinaAlimentacao>{
    // Lista de clientes para simular o armazenamento de dados
    private List<RotinaAlimentacao> rotinaAlimentacaos = new ArrayList<RotinaAlimentacao>();

    // Atributos
    private int idRotinaAlimentacao;
    private String descricao;
    private List<Alimento> alimentos = new ArrayList<Alimento>();
    private Parceiro parceiro = new Parceiro();

    // GET SET
    public RotinaAlimentacao() {
    }

    public RotinaAlimentacao(int idRotinaAlimentacao,String descricao, List<Alimento> alimentos,int idParceiro) {
        this.idRotinaAlimentacao = idRotinaAlimentacao;
        this.descricao = descricao;
        this.alimentos = alimentos;
        this.parceiro.setIdParceiro(idParceiro);
    }

    public void setIdRotinaAlimentacao(int idRotinaAlimentacao) {
		this.idRotinaAlimentacao = idRotinaAlimentacao;
	}

	public int getIdRotinaAlimentacao() {
		return idRotinaAlimentacao;
	}

    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

    public void setAlimentos(List<Alimento> alimentos) {
		this.alimentos = alimentos;
	}

	public List<Alimento> getExercicios() {
		return alimentos;
	}

    public void setIdParceiro(int idParceiro) {
		this.parceiro.setIdParceiro(idParceiro);
	}

	public int getIdParceiro() {
		return parceiro.getIdParceiro();
	}

    //Metodos
    @Override
    public RotinaAlimentacao Consultar(String id) {
        return rotinaAlimentacaos.stream().filter(x -> x.getIdRotinaAlimentacao() == Integer.parseInt(id)).collect(Collectors.toList()).get(0);
    }

    @Override
    public void Adicionar(RotinaAlimentacao item) {
        rotinaAlimentacaos.add(item);
    }

    @Override
    public void Atualizar(RotinaAlimentacao item) {
        rotinaAlimentacaos.removeIf(x -> x.getIdRotinaAlimentacao() == item.getIdRotinaAlimentacao());
        rotinaAlimentacaos.add(item);      
    }

    @Override
    public void Deletar(String id) {
        rotinaAlimentacaos.removeIf(x -> x.getIdRotinaAlimentacao() == Integer.parseInt(id));                        
    }
}
