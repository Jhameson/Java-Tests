
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jhame
 */
public class ColecaoPessoa implements Colecao {

    private Pessoa[] dados = new Pessoa[100];
    private int posicaoCorrente = 0;

    private static ColecaoPessoa instance = new ColecaoPessoa();

    public ColecaoPessoa() {
    }

   
    public static ColecaoPessoa getInstance() {
        return instance;
    }

    ///
    @Override
    public boolean inserir(Pessoa P) {

        if (posicaoCorrente < 100) {
            dados[posicaoCorrente] = P;
            posicaoCorrente++;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean removerUltimo() {
        if (posicaoCorrente >= 0 && posicaoCorrente < 100) {
            if (dados[posicaoCorrente] != null) {
                dados[posicaoCorrente] = null;
                posicaoCorrente--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remover(int indice) {
        if (indice >= 0 && indice < 100) {
            if (dados[indice] != null) {
                dados[indice] = null;
                posicaoCorrente--;
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean atualizar(int indice, Pessoa p) {
        if (indice >= 0 && indice < 100) {
            if (dados[indice] != null) {
                dados[indice] = p;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean pesquisar(Pessoa p) {
       

       for (int i=0;i<100;i++){
            if (dados[i].getNome().equals(p.getNome())){
                 return true;
            }
        }

        return false;

    }

    @Override
    public boolean colecaoEstaVazia() {
        if (dados.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void imprimirDadosColecao() {
        for (int i = 0; i < posicaoCorrente; i++) {
            System.out.println("" + dados[i]);
        }
    }

    @Override
    public Pessoa retornarObjeto(int indice) {
        if (indice >= 0 && indice < 100) {
            return dados[indice];
        }
        return null;
    }

    public Pessoa[] getDados() {
        return dados;
    }

    public void setDados(Pessoa[] dados) {
        this.dados = dados;
    }

    public int getPosicaoCorrente() {
        return posicaoCorrente;
    }

    public void setPosicaoCorrente(int posicaoCorrente) {
        this.posicaoCorrente = posicaoCorrente;
    }
    

}
