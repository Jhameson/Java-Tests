/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhame
 */
public interface Colecao {

    public boolean inserir(Pessoa P);

    public boolean removerUltimo();

    public boolean remover(int indice);

    public boolean atualizar(int indice, Pessoa p);

    public boolean pesquisar(Pessoa p);

    public boolean colecaoEstaVazia();

    public void imprimirDadosColecao();

    public Pessoa retornarObjeto(int indice);
    
    
}
