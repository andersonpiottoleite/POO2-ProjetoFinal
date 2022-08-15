package br.com.ada.projetofinal.repository;

public class Repository<T> {

    public T save(T t){
        System.out.println("Salvando");
        return t;
    }


    public T update(T t){
        System.out.println("Alterando");
        return t;
    }

    public void delete(T t){
        System.out.println("Deletando");
    }

    public T find(T t){
        System.out.println("Buscando");
        return t;
    }
}
