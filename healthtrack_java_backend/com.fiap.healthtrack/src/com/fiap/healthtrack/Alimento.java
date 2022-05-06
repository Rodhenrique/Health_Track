package com.fiap.healthtrack;

import java.util.ArrayList;

public class Alimento implements ICrud<Alimento>{
    // Lista de clientes para simular o armazenamento de dados
    private List<Alimento> alimentos = new ArrayList<Alimento>();

    // Atributos
    private int idAlimento;
    private int tipo;
	private String descricao;
	private float porcao;
    private double quantidadeGrama;
    private int calorias;
    private boolean privado;
    // GET SET
    public Alimento() {
    }

    public Alimento(int idAlimento, TipoAlimento tipo, String descricao, float porcao, double quantidadeGrama, int calorias, boolean privado) {
        this.idAlimento = idAlimento;
        this.tipo = tipo.ordinal();
        this.descricao = descricao;
        this.porcao = porcao;
        this.quantidadeGrama = quantidadeGrama;
        this.calorias = calorias;
        this.privado = privado;
    }
    
    public int getIdAlimento() {
		return idAlimento;
	}

	public void setIdAlimento(int idAlimento) {
		this.idAlimento = idAlimento;
	}

    public int getTipo() {
		return tipo;
	}

	public void setTipo(TipoAlimento tipo) {
		this.tipo = tipo.ordinal();
	}

    public String getDescricao() {
		return descricao;
	}

    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

    public Float getPorcao() {
		return porcao;
	}

    public void setPorcao(Float porcao) {
		this.porcao = porcao;
	}

    public double getQuantidadeGrama() {
		return quantidadeGrama;
	}

    public void setQuantidadeGrama(Double quantidadeGrama) {
		this.quantidadeGrama = quantidadeGrama;
	}
    
    public int getCalorias() {
		return calorias;
	}

    public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

    public boolean getPrivado() {
		return privado;
	}

    public void setPrivado(Boolean privado) {
		this.privado = privado;
	}

    // Metodos      
    @Override
    public Alimento Consultar(String id) {
        return alimentos.stream().filter(x -> x.getIdAlimento() == Integer.parseInt(id)).collect(Collectors.toList()).get(0);
    }

    @Override
    public void Adicionar(Alimento item) {
        alimentos.add(item);        
    }

    @Override
    public void Atualizar(Alimento item) {        
        alimentos.removeIf(x -> x.getIdAlimento() == item.getIdAlimento());
        alimentos.add(item);  
    }

    @Override
    public void Deletar(String id) {
        alimentos.removeIf(x -> x.getIdAlimento() == Integer.parseInt(id));                
    }
   
    public List<Alimento> Listar() {
        return alimentos;
    }
}
