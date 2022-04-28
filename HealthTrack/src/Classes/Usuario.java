package Classes;

import java.time.LocalDateTime;
import Enums.Genero;

public class Usuario extends Conta{    
    // Atributos
	private String nome;
    private String sobrenome;	
    private String endereco;	
	private LocalDateTime dataNascimento;	
	private int genero;		  
  
    // GET SET
    public void setUsuario(int idUsuario, String nome, String sobrenome, String endereco, LocalDateTime dataNascimento, Genero genero, String username, String email, String senha)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.genero = genero.ordinal();
		this.setEmail(email);
		this.setIdConta(idUsuario);
		this.setUsername(username);
		this.setSenha(senha);
		setDataCriacao(LocalDateTime.now());
		setDataAlteracao(LocalDateTime.now());
    }

    public int getIdUsuario() {
		return getIdConta();
	}

    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

    public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

    public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

    public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime data) {
		this.dataNascimento = data;
	}
    
    public int getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero.ordinal();
	}
}
