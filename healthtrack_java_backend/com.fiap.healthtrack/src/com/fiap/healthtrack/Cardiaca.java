package com.fiap.healthtrack;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Cardiaca implements ICrud<Cardiaca> {
    // Lista de clientes para simular o armazenamento de dados
    private List<Cardiaca> pressaoArterials = new ArrayList<Cardiaca>();

     // Atributos
    private int idPressaoArterial;
    private int sistolica;
	private int diastolica;
	private float bpm;
    private Cliente cliente = new Cliente();
    private LocalDateTime dataCriacao;	
    private LocalDateTime dataAlteracao;

    // GET SET

    public Cardiaca() {
    }

    public Cardiaca(int idPressaoArterial,int sistolica, int diastolica, float bpm, int idCliente, LocalDateTime dataCriacao, LocalDateTime dataAlteracao) {
        this.idPressaoArterial = idPressaoArterial;
        this.sistolica = sistolica;
        this.diastolica = diastolica;
        this.bpm = bpm;
        this.cliente.setIdCliente(idCliente);
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
    }
  
    public int getIdPressaoArterial() {
		return idPressaoArterial;
	}

	public void setIdPressaoArteria(int idPressaoArterial) {
		this.idPressaoArterial = idPressaoArterial;
	}

	public int getSistolica() {
		return sistolica;
	}

	public void setSistolica(int sistolica) {
		this.sistolica = sistolica;
	}

	public int getDiastolica() {
		return diastolica;
	}

	public void setDiastolica(int diastolica) {
		this.diastolica = diastolica;
	}

	public float getBpm() {
		return bpm;
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
    public Cardiaca Consultar(String id) {
        return pressaoArterials.stream().filter(x -> x.getIdPressaoArterial() == Integer.parseInt(id)).collect(Collectors.toList()).get(0);
    }

    @Override
    public void Adicionar(Cardiaca item) {
        pressaoArterials.add(item);        
    }

    @Override
    public void Atualizar(Cardiaca item) {
        pressaoArterials.removeIf(x -> x.getIdPressaoArterial() == item.getIdPressaoArterial());
        pressaoArterials.add(item);        
    }

    @Override
    public void Deletar(String id) {
        pressaoArterials.removeIf(x -> x.getIdPressaoArterial() == Integer.parseInt(id));                
    }

    public List<Cardiaca> ListarPorIdCliente(int idCliente) {
        return pressaoArterials.stream().filter(x -> x.cliente.getIdCliente() == idCliente).toList();
    }
}
