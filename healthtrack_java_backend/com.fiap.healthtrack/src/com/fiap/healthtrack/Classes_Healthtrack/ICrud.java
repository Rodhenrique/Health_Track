package com.fiap.healthtrack;

public interface ICrud<T> {
    public T Consultar(String id);
	public void Adicionar(T item);
	public void Atualizar(T item);
	public void Deletar(String id);
}