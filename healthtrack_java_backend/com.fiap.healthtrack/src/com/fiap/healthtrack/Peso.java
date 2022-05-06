package com.fiap.healthtrack;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Peso implements ICrud<Peso>{
    // Lista de clientes para simular o armazenamento de dados
    private List<Peso> pesos = new ArrayList<Peso>();

    // Atributos
    private int idPeso;
    private float kilos;
    private LocalDateTime dataCriacao;	
    private LocalDateTime dataAlteracao;
    private Cliente cliente = new Cliente();
    
    
    // GET SET
    public Peso() {
    }

    public Peso(int idPeso, float kilos, LocalDateTime dataCriacao,LocalDateTime dataAlteracao, int idCliente) {
        this.idPeso = idPeso;
        this.kilos = kilos;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.cliente.setIdCliente(idCliente);
    }
    

    public void setIdPeso(int idPeso)
    {
        this.idPeso = idPeso;
    }

    public int getIdPeso()
    {
        return idPeso;
    }

    public void setKilos(Float kilos)
    {
        this.kilos = kilos;
    }

    public float getKilos()
    {
        return kilos;
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

    public int getIdCliente() {
		return cliente.getIdCliente();
	}

	public void setIdCliente(int idCliente) {
		this.cliente.setIdCliente(idCliente);
	}

    // Metodos
    @Override
    public Peso Consultar(String id) {
        return pesos.stream().filter(x -> x.getIdPeso() == Integer.parseInt(id)).collect(Collectors.toList()).get(0);
    }

    @Override
    public void Adicionar(Peso item) {
        pesos.add(item);        
    }

    @Override
    public void Atualizar(Peso item) {
        pesos.removeIf(x -> x.getIdPeso() == item.getIdPeso());
        pesos.add(item);         
    }

    @Override
    public void Deletar(String id) { 
        pesos.removeIf(x -> x.getIdPeso() == Integer.parseInt(id));                       
    }

    public List<Peso> ListarPorIdCliente(int idCliente) {
        return pesos.stream().filter(x -> x.cliente.getIdCliente() == idCliente).toList();
    }

    public float obterImc(Float altura, float kilos)
    {
        return (altura * altura) / kilos;
    }
}