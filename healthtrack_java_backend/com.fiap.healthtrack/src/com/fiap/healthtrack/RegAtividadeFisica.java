package com.fiap.healthtrack;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RegAtividadeFisica extends AtividadeFisica implements ICrud<RegAtividadeFisica>{
    // Lista de clientes para simular o armazenamento de dados
    private List<RegAtividadeFisica> atividadeFisicas = new ArrayList<RegAtividadeFisica>();

    // Atributos
    private int idAtividadeFisica;
    private LocalTime tempo;
    private int repeticoes;
    private int queimaCalorica;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao; 
    private AtividadeFisica exercicio = new AtividadeFisica();
    private Cliente cliente = new Cliente();

    public RegAtividadeFisica() {
    }

    public RegAtividadeFisica(int idAtividadeFisica,LocalTime tempo, int repeticoes, int queimaCalorica,LocalDateTime dataCriacao, LocalDateTime dataAlteracao,int idExercicio ,int idCliente) {
        this.idAtividadeFisica = idAtividadeFisica;
        this.tempo = tempo;
        this.repeticoes = repeticoes;
        this.queimaCalorica = queimaCalorica;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.exercicio.setIdExercicio(idExercicio);
        this.cliente.setIdCliente(idCliente);
    }

    // GET SET

    public void setIdAtividadeFisica(int idAtividadeFisica) {
		this.idAtividadeFisica = idAtividadeFisica;
	}

	public int getIdAtividadeFisica() {
		return idAtividadeFisica;
	}

    public void setTempo(LocalTime tempo) {
		this.tempo = tempo;
	}

	public LocalTime getTempo() {
		return tempo;
	}

    public void setRepeticoes(int repeticoes) {
		this.repeticoes = repeticoes;
	}

	public int getRepeticoes() {
		return repeticoes;
	}

    public void setQueimaCalorica(int queimaCalorica) {
		this.queimaCalorica = queimaCalorica;
	}

	public int getQueimaCalorica() {
		return queimaCalorica;
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

    public int getIdExercicio() {
		return exercicio.getIdExercicio();
	}

	public void setIdExercicio(int idExercicio) {
		this.exercicio = new AtividadeFisica().consultarExercicio(idExercicio);
	}

    //Metodos
    @Override
    public RegAtividadeFisica Consultar(String id) {
        return atividadeFisicas.stream().filter(x -> x.getIdExercicio() == Integer.parseInt(id)).collect(Collectors.toList()).get(0);
    }

    @Override
    public void Adicionar(RegAtividadeFisica item) {
        atividadeFisicas.add(item);        
    }

    @Override
    public void Atualizar(RegAtividadeFisica item) {
        atividadeFisicas.removeIf(x -> x.getIdAtividadeFisica() == item.getIdAtividadeFisica());
        atividadeFisicas.add(item);         
    }

    @Override
    public void Deletar(String id) {
        atividadeFisicas.removeIf(x -> x.getIdAtividadeFisica() == Integer.parseInt(id));                                 
    }
    public List<RegAtividadeFisica> ListarPorIdCliente(int idCliente) {
        return atividadeFisicas.stream().filter(x -> x.cliente.getIdCliente() == idCliente).toList();
    }

}
