package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Interfaces.ICrud;

public class ClienteRotinaAlimentacao implements ICrud<ClienteRotinaAlimentacao>{
    // Lista de clientes para simular o armazenamento de dados
    private List<ClienteRotinaAlimentacao> clienteRotinaAlimentacaos = new ArrayList<ClienteRotinaAlimentacao>();

    // Atributos
    private int idClienteRotinaAlimentacao;
    private Cliente cliente = new Cliente();
    private RotinaAlimentacao rotinaAlimentacao = new RotinaAlimentacao();

    // GET SET
    public ClienteRotinaAlimentacao() {
    }

    public ClienteRotinaAlimentacao(int idClienteRotinaAlimentacao, int idCliente, int idRotinaAlimentacao) {
        this.idClienteRotinaAlimentacao = idClienteRotinaAlimentacao;
        this.cliente.setIdCliente(idCliente);
        this.rotinaAlimentacao.setIdRotinaAlimentacao(idRotinaAlimentacao);
    }

    public void setIdClienteRotinaAlimentacao(int idClienteRotinaAlimentacao) {
        this.idClienteRotinaAlimentacao = idClienteRotinaAlimentacao;
    }
    
    public int getIdClienteRotinaAlimentacao() {
        return idClienteRotinaAlimentacao;
    }
    
    public int getIdCliente() {
        return cliente.getIdCliente();
    }
    
    public void setIdCliente(int idCliente) {
        this.cliente.setIdCliente(idCliente);
    }
    
    public int getIdRotinaAlimentacao() {
        return rotinaAlimentacao.getIdRotinaAlimentacao();
    }

    public void setIdRotinaAlimentacao(int idRotinaAlimentacao) {
        this.rotinaAlimentacao.setIdRotinaAlimentacao(idRotinaAlimentacao);
    }

    //Metodos
    @Override
    public ClienteRotinaAlimentacao Consultar(String id) {
        return clienteRotinaAlimentacaos.stream().filter(x -> x.getIdClienteRotinaAlimentacao() == Integer.parseInt(id)).collect(Collectors.toList()).get(0);
    }

    @Override
    public void Adicionar(ClienteRotinaAlimentacao item) {
        clienteRotinaAlimentacaos.add(item);              
    }

    @Override
    public void Atualizar(ClienteRotinaAlimentacao item) {
        clienteRotinaAlimentacaos.removeIf(x -> x.getIdClienteRotinaAlimentacao() == item.getIdClienteRotinaAlimentacao());
        clienteRotinaAlimentacaos.add(item);  
    }

    @Override
    public void Deletar(String id) {
        clienteRotinaAlimentacaos.removeIf(x -> x.getIdClienteRotinaAlimentacao() == Integer.parseInt(id));                              
    }
}
