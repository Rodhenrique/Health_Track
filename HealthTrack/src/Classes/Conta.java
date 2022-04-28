package Classes;

import java.time.LocalDateTime;

public abstract class Conta {
    private int idConta;
	private String username;
    private String email;	
	private String senha;
	private LocalDateTime dataCriacao;	
	private LocalDateTime dataAlteracao;
	
    // GET SET
	public Conta() {
		
	}

	public Conta(int idConta, String username, String email, String senha, LocalDateTime dataCriacao,LocalDateTime dataAlteracao) {
		this.idConta = idConta;
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
	}

	protected int getIdConta() {
		return idConta;
	}

    protected void setIdConta(int idConta) {
        this.idConta = idConta;
	}

	public String getUsername() {
		return username;
	}

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
}
