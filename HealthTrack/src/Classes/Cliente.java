package Classes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Enums.Genero;
import Enums.Plano;
import Interfaces.ICrud;

public class Cliente extends Usuario implements ICrud<Cliente>{
    // Lista de clientes para simular o armazenamento de dados
    private List<Cliente> clientes = new ArrayList<Cliente>();
    
    // Atributos
    private int plano;
	private float altura;

    // GET SET
    public Cliente() {  
    }

    public Cliente(int idCliente, String nome, String sobrenome, String endereco, LocalDateTime dataNascimento, String email, Genero genero, int plano, float altura, String username, String senha) {
        setUsuario(idCliente, nome, sobrenome, endereco, dataNascimento, genero,username,email,senha);
        this.plano = plano;
        this.altura = altura;
    }

    public int getIdCliente()
    {
        return getIdUsuario();
    }

    public void setIdCliente(int idCliente)
    {
        setIdConta(idCliente);
    }
    
    public int getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano.ordinal();
	}

    public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
    
    // Metodos
    @Override
    public Cliente Consultar(String id) {       
        return clientes.stream().filter(x -> x.getIdCliente() == Integer.parseInt(id)).collect(Collectors.toList()).get(0);
    }

    @Override
    public void Adicionar(Cliente item) {
        clientes.add(item);
    }

    @Override
    public void Atualizar(Cliente item) {
        clientes.removeIf(x -> x.getIdCliente() == item.getIdCliente());
        clientes.add(item);
    }

    @Override
    public void Deletar(String id) {
        clientes.removeIf(x -> x.getIdCliente() == Integer.parseInt(id));        
    }
}
