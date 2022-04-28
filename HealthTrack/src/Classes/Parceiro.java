package Classes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Enums.Genero;
import Enums.TipoParceiro;
import Interfaces.ICrud;

public class Parceiro extends Usuario implements ICrud<Parceiro>{
    // Lista de clientes para simular o armazenamento de dados
    private List<Parceiro> parceiros = new ArrayList<Parceiro>();
    
    // Atributos
	private int tipoParceiro;
	private String descricaoParceiro;	
	
    // GET SET
    public Parceiro() {
    }
    
    public Parceiro(int idCliente, String nome, String sobrenome, String endereco, LocalDateTime dataNascimento, Genero genero, TipoParceiro tipoParceiro, String descricaoParceiro, String username, String email, String senha)
    {
        setUsuario(idCliente, nome, sobrenome, endereco, dataNascimento, genero,username,email,senha);
        this.tipoParceiro = tipoParceiro.ordinal();
        this.descricaoParceiro = descricaoParceiro;
    }
    
    public int getIdParceiro() {
		return getIdUsuario();
	}

    public void setIdParceiro(int idParceiro) {
		setIdConta(idParceiro);
	}

	public String getDescricaoParceiro() {
		return descricaoParceiro;
	}

	public void setDescricaoParceiro(String descricaoParceiro) {
		this.descricaoParceiro = descricaoParceiro;
	}

	public int getTipoParceiro() {
		return tipoParceiro;
	}

    public void setTipoParceiro(int tipoParceiro) {
		this.tipoParceiro = tipoParceiro;
	}

    //Metodos
    @Override
    public Parceiro Consultar(String id) {
        return parceiros.stream().filter(x -> x.getIdParceiro() == Integer.parseInt(id)).collect(Collectors.toList()).get(0);
    }

    @Override
    public void Adicionar(Parceiro item) {
        parceiros.add(item);                
    }

    @Override
    public void Atualizar(Parceiro item) {
        parceiros.removeIf(x -> x.getIdParceiro() == item.getIdParceiro());
        parceiros.add(item);  
    }

    @Override
    public void Deletar(String id) {
        parceiros.removeIf(x -> x.getIdParceiro() == Integer.parseInt(id));                               
    }

    public List<Parceiro> Listar()
    {
        return parceiros;
    }
}
