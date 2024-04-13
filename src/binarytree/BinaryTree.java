package binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTree {

    //Uma arvore binaria tem um os nós a esquerda e a direita, começando pela raiz. 
    No raiz;
    private ArrayList<No> noArvore;

    public BinaryTree() {
        this.raiz = null;
        this.noArvore = new ArrayList();
    }

    //Os metodos que um árvore pode ter é: Inserção, remoção, busca, balanceamento, imprimir árvore.
    //(inicio)Metodos de inserir: 
    public No insercao(Item item, No raiz) { //87 - 16 - 61 - 
        if (raiz == null) {
            raiz = new No();
            raiz.item = item;
            raiz.esq = null;
            raiz.dir = null;
            this.noArvore.add(raiz);
        } else if (item.comparaItem(raiz.item) < 0) {
            raiz.esq = insercao(item, raiz.esq);
        } else if (item.comparaItem(raiz.item) > 0) {
            raiz.dir = insercao(item, raiz.dir);
        }
        return raiz;
    }

    public void insercaoSemRetorno(Item item, No no) {//10 - 
        if (no == null) {
            raiz = new No(item);
            this.noArvore.add(raiz);
        } else {
            if (item.comparaItem(no.item) < 0) {
                if (no.esq != null) {
                    insercaoSemRetorno(item, no.esq);
                } else {
                    no.esq = new No(item);
                    this.noArvore.add(no.esq);
                }
            } else if (item.comparaItem(no.item) > 0) {
                if (no.dir != null) {
                    insercaoSemRetorno(item, no.dir);
                } else {
                    no.dir = new No(item);
                    this.noArvore.add(no.dir);
                }
            }
        }
    }

    //(Fim)Metodos de inserir: 
    //(Inicio)Metodos de pesquisa: 
    public Item pesquisa(Item item) {
        return this.pesquisa(item, this.raiz);
    }

    private Item pesquisa(Item item, No no) {
        if (no == null) {
            return null;
        } else if (item.comparaItem(no.item) < 0) {
            return pesquisa(item, no.esq);
        } else if (item.comparaItem(no.item) > 0) {
            return pesquisa(item, no.dir);
        }
        return no.item;
    }

    public Item pesquisaIte(Item item) {
        return this.pesquisaIte(item, this.raiz);
    }

    private Item pesquisaIte(Item item, No no) {
        while (no != null) {
            if (item.comparaItem(no.item) < 0) {
                no = no.esq;
            } else if (item.comparaItem(no.item) > 0) {
                no = no.dir;
            } else {
                return no.item;
            }
        }
        return null;
    }

    //(Fim)Metodos de pesquisa: 
    private No antecessor(No q, No r) {
        if (r.dir != null) {
            r.dir = antecessor(q, r.dir);
        } else {
            q.item = r.item;
            r = r.esq;
        }
        return r;
    }

    public No retira(Item item, No no) {
        if (no == null) {
            System.out.println("Erro: Registro não encontrado!");
        } else if (item.comparaItem(no.item) < 0) {
            no.esq = retira(item, no.esq);
        } else if (item.comparaItem(no.item) > 0) {
            no.dir = retira(item, no.dir);
        } else {
            if (no.dir == null) {
                no = no.esq;
            } else if (no.esq == null) {
                no = no.dir;
            } else {
                no.esq = antecessor(no, no.esq);
            }
        }
        return no;
    }

    //(Inicio)Metodos para imprimir: 
    public void imprimeOrdemCrescente() {
        this.centralOrdemCrescente(this.raiz);
    }

    private void centralOrdemCrescente(No no) {
        if (no != null) {
            centralOrdemCrescente(no.esq);
            System.out.print("[" + no.item.toString() + "] ");
            centralOrdemCrescente(no.dir);
        }
    }

    public void imprimeOrdemDecrescente() {
        this.centralOrdemDecrescente(this.raiz);
    }

    private void centralOrdemDecrescente(No no) {
        if (no != null) {
            centralOrdemDecrescente(no.dir);
            System.out.print("[" + no.item.toString() + "] ");
            centralOrdemDecrescente(no.esq);
        }
    }

    public void imprimeOrdemAleatoriaPelaEsquerda() {
        this.centralOrdemCrescente(this.raiz);
    }

    private void centralOrdemAleatoriaPelaEsquerda(No no) {
        if (no != null) {
            System.out.println(no.item.toString());
            centralOrdemAleatoriaPelaEsquerda(no.esq);
            centralOrdemAleatoriaPelaEsquerda(no.dir);
        }
    }

    public void imprimeOrdemAleatoriaPelaDireita() {
        this.centralOrdemDecrescente(this.raiz);
    }

    private void centralOrdemAleatoriaPelaDireita(No no) {
        if (no != null) {
            System.out.println(no.item.toString());
            centralOrdemAleatoriaPelaDireita(no.dir);
            centralOrdemAleatoriaPelaDireita(no.esq);
        }
    }

    public void imprimeIteracao() {
        this.centralIteracao(this.raiz);
    }

    private void centralIteracao(No no) {
        this.ordenarArray();
        for (No noAr : noArvore) {
            System.out.print("[" + noAr.item + "] ");
        }
    }

    private void ordenarArray() {
        Collections.sort(noArvore);
    }

    //(Fim)Metodos para imprimir: 
    //(Inicio)Metodos para calcular altura: 
    public Integer alturaArvore(No no) {
        if (no == null) {
            return -1;
        } else {
            int esquerda = alturaArvore(no.esq);
            int direita = alturaArvore(no.dir);
            if (esquerda > direita) {
                return esquerda + 1;
            } else {
                return direita + 1;
            }
        }
    }

    //(Fim)Metodos para calcular altura: 
    public void balanceamento() {

    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public No getRaiz() {
        return this.raiz;
    }
}
