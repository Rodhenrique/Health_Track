package com.fiap.healthtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class RegAlimento implements ICrud<RegAlimento>{
    // Lista de clientes para simular o armazenamento de dados
    private List<RegAlimento> alimentoConsumidos = new ArrayList<RegAlimento>();
    
    // Atributos
    private int idAlimentoConsumido;
    private Cliente cliente = new Cliente();
    private Alimento alimento = new Alimento();
    private float porcao;
    private double quantidadeGrama;
    private int calorias;
    private LocalDateTime dataCriacao;	
    private LocalDateTime dataAlteracao;
    
    // GET SET
    public RegAlimento() {

    }

    public RegAlimento(int idAlimentoConsumido, int idCliente, int idAlimento,float porcao,double quantidadeGrama,int calorias, LocalDateTime dataCriacao, LocalDateTime dataAlteracao) {
        this.idAlimentoConsumido = idAlimentoConsumido;
        this.cliente.setIdCliente(idCliente);
        this.alimento.setIdAlimento(idAlimento);
        this.porcao = porcao;
        this.quantidadeGrama = quantidadeGrama;
        this.calorias = calorias;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
    }

    public int getIdAlimentoConsumido() {
		return idAlimentoConsumido;
	}

	public void setIdAlimentoConsumido(int idAlimentoConsumido) {
		this.idAlimentoConsumido = idAlimentoConsumido;
	}

    public int getIdCliente() {
		return cliente.getIdCliente();
	}

	public void setIdCliente(int idCliente) {
		this.cliente.setIdCliente(idCliente);
	}

    public int getAlimento() {
		return alimento.getIdAlimento();
	}

	public void setAlimento(int idAlimento) {
		this.alimento.setIdAlimento(idAlimento);
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

    public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
    
    public LocalDateTime getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(LocalDateTime dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
    
    // Metodos      
    public List<RegAlimento> Listar(int idCliente) {
        return alimentoConsumidos.stream().filter(x -> x.cliente.getIdCliente() == idCliente).toList();
    }

    @Override
    public RegAlimento Consultar(String id) {
        return alimentoConsumidos.stream().filter(x -> x.getIdAlimentoConsumido() == Integer.parseInt(id)).collect(Collectors.toList()).get(0);
    }


    @Override
    public void Adicionar(RegAlimento item) {
        alimentoConsumidos.add(item);        
    }


    @Override
    public void Atualizar(RegAlimento item) {
        alimentoConsumidos.removeIf(x -> x.getIdAlimentoConsumido() == item.getIdAlimentoConsumido());
        alimentoConsumidos.add(item);        
    }


    @Override
    public void Deletar(String id) {
        alimentoConsumidos.removeIf(x -> x.getIdAlimentoConsumido() == Integer.parseInt(id));                
    }

    public List<RegAlimento> ListarPorIdCliente(int idCliente) {
        return alimentoConsumidos.stream().filter(x -> x.cliente.getIdCliente() == idCliente).toList();
    }
}
