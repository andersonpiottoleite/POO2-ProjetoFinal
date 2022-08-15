package br.com.ada.projetofinal.test;

import br.com.ada.projetofinal.model.Carteiro;
import br.com.ada.projetofinal.model.Entrega;
import br.com.ada.projetofinal.model.Postagem;
import br.com.ada.projetofinal.model.Produto;
import br.com.ada.projetofinal.repository.Repository;

public class RepositoryTest {

    public static void main(String[] args) {
        Repository<Carteiro> carteiroRepository = new Repository<>();
        Carteiro carteiro = new Carteiro();
        carteiroRepository.save(carteiro);
        carteiroRepository.update(carteiro);
        carteiroRepository.find(carteiro);
        carteiroRepository.delete(carteiro);

        Repository<Produto> produtoRepository = new Repository<>();
        Produto produto = new Produto();
        produtoRepository.save(produto);
        produtoRepository.update(produto);
        produtoRepository.find(produto);
        produtoRepository.delete(produto);

        Repository<Entrega> entregaRepository = new Repository<>();
        Entrega entrega = new Entrega();
        entregaRepository.save(entrega);
        entregaRepository.update(entrega);
        entregaRepository.find(entrega);
        entregaRepository.delete(entrega);

        Repository<Postagem> postagemRepository = new Repository<>();
        Postagem postagem = new Postagem();
        postagemRepository.save(postagem);
        postagemRepository.update(postagem);
        postagemRepository.find(postagem);
        postagemRepository.delete(postagem);
    }
}
