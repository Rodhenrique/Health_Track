package Classes;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Enums.TipoExercicio;

public class Exercicio {
     // Lista de clientes para simular o armazenamento de dados
     private List<Exercicio> exercicios = new ArrayList<Exercicio>();

    // Atributos
    private int idExercicio;
    private int tipoExercicio;
    private String descricao;
    private LocalTime tempo;
    private int repeticoes;
    private int queimaCalorica;
	private boolean privado;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;
    private Parceiro parceiro = new Parceiro();

    public Exercicio() {
    }

    // GET SET
    public Exercicio(int idExercicio, TipoExercicio tipoExercicio, String descricao,LocalTime tempo, int repeticoes, int queimaCalorica,boolean privado,LocalDateTime dataCriacao, LocalDateTime dataAlteracao, int idParceiro)
    {
        this.idExercicio = idExercicio;
        this.tipoExercicio = tipoExercicio.ordinal();
        this.descricao = descricao;
        this.tempo = tempo;
        this.repeticoes = repeticoes;
        this.queimaCalorica = queimaCalorica;
		this.privado = privado;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.parceiro.setIdParceiro(idParceiro);
    }

    public void setIdExercicio(int idExercicio) {
		this.idExercicio = idExercicio;
	}

	public int getIdExercicio() {
		return idExercicio;
	}

    public void setTipoExercicio(TipoExercicio tipoExercicio) {
		this.tipoExercicio = tipoExercicio.ordinal();
	}

	public int getTipoExercicio() {
		return tipoExercicio;
	}

    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

    public void setTempo(LocalTime  tempo) {
		this.tempo = tempo;
	}

	public LocalTime  getTempo() {
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

	public void setPrivado(Boolean privado) {
		this.privado = privado;
	}

	public boolean getPrivado() {
		return privado;
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

    public void setIdParceiro(int idParceiro) {
		this.parceiro.setIdParceiro(idParceiro);
	}

	public int getIdParceiro() {
		return parceiro.getIdParceiro();
	}
    
    public Exercicio consultarExercicio(int idExercicio)
    {
        return exercicios.stream().filter(x -> x.getIdExercicio() == idExercicio).collect(Collectors.toList()).get(0);
    }

    public void AdicionarExercicio(Exercicio item)
    {
        exercicios.add(item);
    }
}
