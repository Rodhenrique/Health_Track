package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Interfaces.ICrud;

public class ClienteRotinaExercicio implements ICrud<ClienteRotinaExercicio> {
    // Lista de clientes para simular o armazenamento de dados
    private List<ClienteRotinaExercicio> clienteRotinaExercicio = new ArrayList<ClienteRotinaExercicio>();

    // Atributos
    private int idClienteRotinaExercicio;
    private Cliente cliente = new Cliente();
    private RotinaExercicio rotinaExercicio = new RotinaExercicio();


    // GET SET
    public ClienteRotinaExercicio() {
    }

    public ClienteRotinaExercicio(int idClienteRotinaExercicio, int idCliente, int idRotinaExercicio) {
        this.idClienteRotinaExercicio = idClienteRotinaExercicio;
        this.cliente.setIdCliente(idCliente);
        this.rotinaExercicio.setIdRotinaExercicio(idRotinaExercicio);
    }

    public void setIdClienteRotinaExercicio(int idRotinaExercicio) {
      this.idClienteRotinaExercicio = idRotinaExercicio;
    }

    public int getIdClienteRotinaExercicio() {
      return idClienteRotinaExercicio;
    }

      public int getIdCliente() {
      return cliente.getIdCliente();
    }

    public void setIdCliente(int idCliente) {
      this.cliente.setIdCliente(idCliente);
    }

      public int getIdRotinaExercicio() {
      return rotinaExercicio.getIdRotinaExercicio();
    }

    public void setIdRotinaExercicio(int idRotinaExercicio) {
      this.rotinaExercicio.setIdRotinaExercicio(idRotinaExercicio);
    }

    //Metodos
    @Override
    public ClienteRotinaExercicio Consultar(String id) {
      return clienteRotinaExercicio.stream().filter(x -> x.getIdClienteRotinaExercicio() == Integer.parseInt(id)).collect(Collectors.toList()).get(0);
    }

    @Override
    public void Adicionar(ClienteRotinaExercicio item) {
      clienteRotinaExercicio.add(item);      
    }

    @Override
    public void Atualizar(ClienteRotinaExercicio item) {
      clienteRotinaExercicio.removeIf(x -> x.getIdClienteRotinaExercicio() == item.getIdClienteRotinaExercicio());
      clienteRotinaExercicio.add(item);       
    }

    @Override
    public void Deletar(String id) {
      clienteRotinaExercicio.removeIf(x -> x.getIdClienteRotinaExercicio() == Integer.parseInt(id));                      
    }
}
