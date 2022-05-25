package com.fiap.healthtrack;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class AlimentoConsumido implements ICrud<AlimentoConsumido>{
    // Lista de clientes para simular o armazenamento de dados
    private List<AlimentoConsumido> alimentoConsumidos = new ArrayList<AlimentoConsumido>();
    
    // Atributos
    private int idRegistro;
    private LocalDateTime dtRegistro;
    private int qntAlimento;
    private Cliente cliente = new Cliente();
    private Alimento alimento = new Alimento();
    private float porcao;
    private double quantidadeGrama;
    private int calorias;	
    private LocalDateTime dataAlteracao;
    
    // GET SET
    public AlimentoConsumido() {

    }

    public AlimentoConsumido(int idAlimentoConsumido, int idCliente, int idAlimento,float porcao,double quantidadeGrama,int calorias, LocalDateTime dataCriacao, LocalDateTime dataAlteracao) {
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
    public List<AlimentoConsumido> Listar(int idCliente) {
        return alimentoConsumidos.stream().filter(x -> x.cliente.getIdCliente() == idCliente).toList();
    }

    @Override
    public AlimentoConsumido Consultar(String id) {
        return alimentoConsumidos.stream().filter(x -> x.getIdAlimentoConsumido() == Integer.parseInt(id)).collect(Collectors.toList()).get(0);
    }


    @Override
    public void Adicionar(AlimentoConsumido item) {
        alimentoConsumidos.add(item);        
    }


    @Override
    public void Atualizar(AlimentoConsumido item) {
        alimentoConsumidos.removeIf(x -> x.getIdAlimentoConsumido() == item.getIdAlimentoConsumido());
        alimentoConsumidos.add(item);        
    }


    @Override
    public void Deletar(String id) {
        alimentoConsumidos.removeIf(x -> x.getIdAlimentoConsumido() == Integer.parseInt(id));                
    }

    public List<AlimentoConsumido> ListarPorIdCliente(int idCliente) {
        return alimentoConsumidos.stream().filter(x -> x.cliente.getIdCliente() == idCliente).toList();
    }
}
