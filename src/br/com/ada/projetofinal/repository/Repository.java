package br.com.ada.projetofinal.repository;

public class Repository<T> {

    public T save(T t){
        System.out.println("Salvando... " + t);
        return t;
    }


    public T update(T t){
        System.out.println("Alterando... " + t);
        return t;
    }

    public void delete(T t){
        System.out.println("Deletando... " + t);
    }

    public T find(T t){
        System.out.println("Buscando... " + t);
        return t;
    }
}
