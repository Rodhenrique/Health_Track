package Interface;

import java.util.List;

public interface ICrud<T> {
    public List<T> Consultar();
    public T ConsultarPorId(int id);
	public void Cadastrar(T item);
	public void Atualizar(T item);
	public void Deletar(int id);
}
